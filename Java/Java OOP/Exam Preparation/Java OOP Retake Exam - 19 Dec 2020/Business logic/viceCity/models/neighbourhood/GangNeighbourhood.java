package viceCity.models.neighbourhood;

import viceCity.models.guns.Gun;
import viceCity.models.players.MainPlayer;
import viceCity.models.players.Player;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class GangNeighbourhood implements Neighbourhood {


    @Override
    public void action(Player mainPlayer, Collection<Player> civilPlayers) {

        List<Player> alivePlayers = civilPlayers.stream().filter(Player::isAlive).collect(Collectors.toList());

        while (!mainPlayer.getGunRepository().getModels().isEmpty()) {

            if (alivePlayers.stream().noneMatch(Player::isAlive)) {
                break;
            }

            if (!mainPlayer.getGunRepository().getModels().stream().allMatch(Gun::canFire)) {
                break;
            }
            alivePlayers.forEach(a ->
                    mainPlayer.getGunRepository().getModels().forEach(gun -> {
                        if (a.isAlive())
                            while (gun.canFire()) {
                                if (!a.isAlive()) {
                                    break;
                                }
                                a.takeLifePoints(gun.fire());
                            }


                    }));


        }

        alivePlayers = civilPlayers.stream().filter(Player::isAlive).collect(Collectors.toList());

        while (mainPlayer.isAlive()) {
            if (alivePlayers.stream().allMatch(a-> a.getGunRepository().getModels().stream().noneMatch(Gun::canFire))) {
            break;
            }

            alivePlayers.forEach(a -> a.getGunRepository().getModels().forEach(gun -> {
                if (mainPlayer.isAlive()) {
                    if (a.isAlive()) {
                        if (gun.canFire()) {
                            mainPlayer.takeLifePoints(gun.fire());
                        }
                    }
                }
            }));

            }


        }
    }



