package CounterStriker.core;

import CounterStriker.models.field.Field;
import CounterStriker.models.field.FieldImpl;
import CounterStriker.models.guns.Gun;
import CounterStriker.models.guns.Pistol;
import CounterStriker.models.guns.Rifle;
import CounterStriker.models.players.CounterTerrorist;
import CounterStriker.models.players.Player;
import CounterStriker.models.players.Terrorist;
import CounterStriker.repositories.GunRepository;
import CounterStriker.repositories.PlayerRepository;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static CounterStriker.common.ExceptionMessages.*;
import static CounterStriker.common.OutputMessages.*;


public class ControllerImpl implements Controller {

    private GunRepository guns;
    private PlayerRepository players;
    private Field field;

    public ControllerImpl() {
        guns = new GunRepository();
        players = new PlayerRepository();
        field = new FieldImpl();
    }

    @Override
    public String addGun(String type, String name, int bulletsCount) {

        Gun gun;
        switch (type) {
            case "Pistol":
                gun = new Pistol(name,bulletsCount);
                break;
            case "Rifle":
                gun = new Rifle(name,bulletsCount);
                break;
            default:
                throw new IllegalArgumentException(INVALID_GUN_TYPE);
        }


        this.guns.add(gun);
        return String.format(SUCCESSFULLY_ADDED_GUN, name);
    }

    @Override
    public String addPlayer(String type, String username, int health, int armor, String gunName) {
        if (guns.findByName(gunName) == null){
            throw new NullPointerException(GUN_CANNOT_BE_FOUND);
        }
        Player player;
        switch (type){
            case "Terrorist":
                player = new Terrorist(username,health, armor, (Gun) guns.findByName(gunName));
                break;
            case "CounterTerrorist":
                player = new CounterTerrorist(username,health,armor, (Gun) guns.findByName(gunName));
                break;
            default:
                throw new IllegalArgumentException(INVALID_PLAYER_TYPE);
        }

        players.add(player);
        return String.format(SUCCESSFULLY_ADDED_PLAYER, username);
    }

    @Override
    public String startGame() {
        List<Player> models = (List<Player>) players.getModels();
        List<Player> alivePlayers = models.stream().filter(Player::isAlive).collect(Collectors.toList());

        return  field.start(alivePlayers);
    }

    @Override
    public String report() {
       StringBuilder stringBuilder = new StringBuilder();

        List<Player> models = (List<Player>) players.getModels();
        models.sort((a,b) -> a.getUsername().compareTo(b.getUsername()));



        List<Player> counterTerrorists = models.stream().filter(a -> a.getClass().getSimpleName().equalsIgnoreCase("CounterTerrorist")).collect(Collectors.toList());


        counterTerrorists.forEach(a-> stringBuilder.append(a.toString()).append(System.lineSeparator()));
        List<Player> terrorists = models.stream().filter(a -> a.getClass().getSimpleName().equalsIgnoreCase("Terrorist")).collect(Collectors.toList());
        terrorists.forEach(a ->  stringBuilder.append(a.toString()).append(System.lineSeparator()));


        return stringBuilder.toString().trim();
    }
}
