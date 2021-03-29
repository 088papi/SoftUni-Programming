package CounterStriker.repositories;

import CounterStriker.models.guns.Gun;

import java.util.ArrayList;
import java.util.Collection;

import static CounterStriker.common.ExceptionMessages.*;

public class GunRepository implements Repository{

    Collection<Gun> models = new ArrayList<>();


    @Override
    public Collection getModels() {
        return this.models;
    }

    @Override
    public void add(Object model) {
        if (model == null){
            throw new NullPointerException(INVALID_GUN_REPOSITORY);
        }

        models.add((Gun) model);
    }

    @Override
    public boolean remove(Object model) {
        if (!models.contains((Gun)model)) {
            return false;
        }

        models.remove(model);
        return true;


    }

    @Override
    public Object findByName(String name) {

        Gun gun = models.stream().filter(a -> a.getName().equals(name)).findFirst()
                .orElse(null);

        return gun;
    }
}
