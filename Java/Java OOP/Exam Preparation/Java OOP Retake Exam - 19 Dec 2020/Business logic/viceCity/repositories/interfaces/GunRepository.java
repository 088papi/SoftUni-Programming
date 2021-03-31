package viceCity.repositories.interfaces;

import viceCity.models.guns.Gun;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class GunRepository implements Repository<Gun> {

    Collection<Gun> models = new ArrayList<>();


    @Override
    public Collection getModels() {
        return Collections.unmodifiableCollection(models);
    }

    @Override
    public void add(Gun model) {
        if (!models.contains(model)) {
            models.add((Gun) model);
        }
    }

    @Override
    public boolean remove(Gun model) {
        if (models.contains(model)) {
            models.remove(model);
            return true;
        }
        return false;
    }

    @Override
    public Gun find(String name) {

        return (Gun) models.stream().filter(a-> a.getName().equals(name)).findFirst().get();
    }
}
