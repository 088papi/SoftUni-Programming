package viceCity.core;

import viceCity.core.interfaces.Controller;
import viceCity.models.guns.Gun;
import viceCity.models.guns.Pistol;
import viceCity.models.guns.Rifle;
import viceCity.models.neighbourhood.GangNeighbourhood;
import viceCity.models.neighbourhood.Neighbourhood;
import viceCity.models.players.CivilPlayer;
import viceCity.models.players.MainPlayer;
import viceCity.models.players.Player;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.stream.Collectors;

import static viceCity.common.ConstantMessages.*;

public class ControllerImpl implements Controller {

    MainPlayer mainPlayer;
    List<Player> civilPlayers;
    Deque<Gun> guns;
    Neighbourhood neighbourhood;

    public ControllerImpl() {
        this.mainPlayer = new MainPlayer();
        this.civilPlayers = new ArrayList<>();
        this.guns = new ArrayDeque<>();
        this.neighbourhood = new GangNeighbourhood();
    }

    @Override
    public String addPlayer(String name) {
        Player player = new CivilPlayer(name);
        civilPlayers.add(player);
        return String.format(PLAYER_ADDED, name);
    }

    @Override
    public String addGun(String type, String name) {
        Gun gun;
        switch (type) {
            case "Pistol":
                gun = new Pistol(name);
                break;
            case "Rifle":
                gun = new Rifle(name);
                break;
            default:
                return GUN_TYPE_INVALID;
        }

        guns.offer(gun);
        return String.format(GUN_ADDED, name, type);
    }

    @Override
    public String addGunToPlayer(String name) {


        if (guns.isEmpty()) {
            return GUN_QUEUE_IS_EMPTY;
        } else if (name.equals("Vercetti")) {
            Gun gun = guns.poll();
            mainPlayer.getGunRepository().add(gun);
            return String.format(GUN_ADDED_TO_MAIN_PLAYER, gun.getName(), "Tommy Vercetti");
        } else if (civilPlayers.stream().noneMatch(e -> e.getName().equals(name))) {
            return CIVIL_PLAYER_DOES_NOT_EXIST;
        } else {
            Gun gun = guns.poll();
            for (Player civilPlayer : civilPlayers) {
                if (civilPlayer.getName().equals(name)) {
                    civilPlayer.getGunRepository().add(gun);
                    assert gun != null;
                    return String.format(GUN_ADDED_TO_CIVIL_PLAYER, gun.getName(), civilPlayer.getName());
                }
            }
            return null;
        }
    }

    @Override
    public String fight() {


        neighbourhood.action(mainPlayer, civilPlayers);
        if (mainPlayer.getLifePoints() == 100 && civilPlayers.stream().allMatch(e -> e.getLifePoints() == 50)) {
            return FIGHT_HOT_HAPPENED;
        }

        List<Player> alive = civilPlayers.stream().filter(Player::isAlive).collect(Collectors.toList());

        List<Player> dead = civilPlayers.stream().filter(e -> !e.isAlive()).collect(Collectors.toList());



        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(FIGHT_HAPPENED).append(System.lineSeparator());
        stringBuilder.append(String.format(MAIN_PLAYER_LIVE_POINTS_MESSAGE, mainPlayer.getLifePoints()))
                .append(System.lineSeparator());
        stringBuilder.append(String.format(MAIN_PLAYER_KILLED_CIVIL_PLAYERS_MESSAGE, dead.size()))
                .append(System.lineSeparator());
        stringBuilder.append(String.format(CIVIL_PLAYERS_LEFT_MESSAGE, alive.size()));

        return stringBuilder.toString().trim();
    }
}
