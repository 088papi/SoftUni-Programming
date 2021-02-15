package rabbits;

import java.util.ArrayList;
import java.util.List;

public class Cage {

    private String name;
    private int capacity;
    private List<Rabbit> data;


    public Cage(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }


    public void add(Rabbit rabbit) {
        if (this.capacity > this.data.size()) {
            this.data.add(rabbit);
        }
    }


    public String getName() {
        return this.name;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public boolean removeRabbit(String name) {
        return this.data.removeIf(e -> e.getName().equals(name));
    }

    public void removeSpecies(String species) {
        this.data.removeIf(e -> e.getSpecies().equals(species));
    }

    public Rabbit sellRabbit(String name) {
        Rabbit rabbit = null;

        for (Rabbit datum : this.data) {
            if (datum.getName().equals(name)) {
                datum.setAvailable(false);
                rabbit = datum;
            }
        }
        return rabbit;
    }

    public List<Rabbit> sellRabbitBySpecies(String species) {
        List<Rabbit> rabbitList = new ArrayList<>();

        for (Rabbit datum : this.data) {
            if (datum.getSpecies().equals(species)) {
                datum.setAvailable(false);
                rabbitList.add(datum);
            }
        }
        return rabbitList;
    }


    public int count() {
        return data.size();
    }


    public String report(){
        StringBuilder sb = new StringBuilder();
        sb.append("Rabbits available at ").append(this.name).append(":").append(System.lineSeparator());

        for (Rabbit datum : this.data) {
            if (datum.isAvailable()){
                sb.append(datum.toString()).append(System.lineSeparator());
            }
        }


        return sb.toString().trim();
    }



    }

