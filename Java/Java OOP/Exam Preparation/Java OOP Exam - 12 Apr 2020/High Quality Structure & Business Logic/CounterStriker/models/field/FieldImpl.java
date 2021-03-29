package CounterStriker.models.field;

import CounterStriker.models.players.Player;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static CounterStriker.common.OutputMessages.COUNTER_TERRORIST_WINS;
import static CounterStriker.common.OutputMessages.TERRORIST_WINS;

public class FieldImpl implements Field {



    @Override
    public String start(Collection<Player> players) {

        List<Player> terrorists =
                players.stream().
                        filter(player -> player.getClass().getSimpleName().
                                equalsIgnoreCase("Terrorist")).collect(Collectors.toList());

        List<Player> counterTerrorists = players.stream().
                filter(player -> player.getClass().getSimpleName().
                        equalsIgnoreCase("CounterTerrorist")).collect(Collectors.toList());


        boolean counterTerroristsWin = false;
        while (true) {

            if (terrorists.stream().noneMatch(Player::isAlive)) {
                counterTerroristsWin = true;
                break;
            }
            if (counterTerrorists.stream().noneMatch(Player::isAlive)) {
                break;
            }

            List<Player> aliveTerrorists = terrorists.stream().filter(Player::isAlive).collect(Collectors.toList());
            List<Player> aliveCounterTerrorists = counterTerrorists.stream().filter(Player::isAlive).collect(Collectors.toList());

            aliveTerrorists.forEach(player -> {
                aliveCounterTerrorists.forEach(a -> a.takeDamage(player.getGun().fire()));
            });


            List<Player> aliveCounterTerrorists2 = counterTerrorists.stream().filter(Player::isAlive).collect(Collectors.toList());

            aliveCounterTerrorists2.forEach(player -> {
                aliveTerrorists.forEach(a -> a.takeDamage(player.getGun().fire()));
            });

        }

        String result;
        if (counterTerroristsWin){
            result = COUNTER_TERRORIST_WINS;
        } else {
            result = TERRORIST_WINS;
        }

        return result;
    }
}
