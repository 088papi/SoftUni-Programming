package easterRaces.repositories.interfaces;

import easterRaces.entities.racers.Race;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class RaceRepository<RaceImpl> implements Repository<Race>{
    private Collection<Race> races;

    public RaceRepository() {
        races = new ArrayList<>();
    }

    @Override
    public Race getByName(String name) {
        for (Race race : races) {
            if (race.getName().equals(name)){
                return  race;
            }
        }

        return null;
    }

    @Override
    public Collection<Race> getAll() {
        return Collections.unmodifiableCollection(races);
    }

    @Override
    public void add(Race model) {
        races.add(model);
    }

    @Override
    public boolean remove(Race model) {
        return races.remove(model);
    }
}
