package CounterStriker.repositories;

import CounterStriker.models.guns.Gun;
import CounterStriker.models.players.Player;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static CounterStriker.common.ExceptionMessages.INVALID_GUN_REPOSITORY;
import static CounterStriker.common.ExceptionMessages.INVALID_PLAYER_REPOSITORY;

public class PlayerRepository implements Repository{

    List<Player> models = new ArrayList<>();

    @Override
    public Collection getModels() {
        return this.models;
    }

    @Override
    public void add(Object model) {
        if (model == null){
            throw new NullPointerException(INVALID_PLAYER_REPOSITORY);
        }
        models.add((Player) model);
    }

    @Override
    public boolean remove(Object model) {
        if (!models.contains((Player)model)) {
            return false;
        }

        models.remove(model);
        return true;
    }

    @Override
    public Object findByName(String name) {
        Player player = models.stream().filter(a -> a.getUsername().equals(name)).findFirst()
                .orElse(null);

        return player;
    }
}
