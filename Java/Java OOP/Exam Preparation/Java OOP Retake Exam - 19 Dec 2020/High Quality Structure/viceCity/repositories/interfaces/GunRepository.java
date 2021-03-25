package viceCity.repositories.interfaces;

import viceCity.models.guns.Gun;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class GunRepository implements Repository {

    List<Gun> models = new ArrayList<>();


    @Override
    public Collection getModels() {
        return Collections.unmodifiableCollection(models);
    }

    @Override
    public void add(Object model) {
        if (!models.contains(model)) {
            models.add((Gun) model);
        }
    }

    @Override
    public boolean remove(Object model) {
        if (models.contains(model)) {
            models.remove(model);
            return true;
        }
        return false;
    }

    @Override
    public Object find(String name) {

        for (Gun model : models) {
            if (model.getName().equals(name)) {
                return model;
            }
        }

        return null;
    }
}
