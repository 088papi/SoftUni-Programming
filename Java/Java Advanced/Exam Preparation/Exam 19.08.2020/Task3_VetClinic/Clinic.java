package vetClinic;

import java.util.ArrayList;
import java.util.List;

public class Clinic {
    private int capacity;
    private List<Pet> data;

    public Clinic(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void add(Pet pet){
        if (capacity > this.data.size()){
            this.data.add(pet);
        }
    }

    public boolean remove(String name){

        for (Pet datum : this.data) {
            if (datum.getName().equals(name)){
                this.data.remove(datum);
                return true;
            }
        }
        return false;
    }

    public Pet getPet(String name, String owner){
        Pet pet = null;

        for (Pet datum : this.data) {
            if (datum.getName().equals(name) && datum.getOwner().equals(owner)){
                pet = datum;
                break;
            }
        }
        return pet;
    }

    public Pet getOldestPet(){
        int oldest = 0;
        Pet oldestPet = null;

        for (Pet datum : this.data) {
            if (datum.getAge() > oldest){
                oldest = datum.getAge();
                oldestPet = datum;
            }
        }
        return oldestPet;
    }

    public int getCount(){
        return this.data.size();
    }

    public String getStatistics(){
        StringBuilder sb = new StringBuilder();
        sb.append("The clinic has the following patients:").append(System.lineSeparator());
        for (Pet datum : this.data) {
            sb.append(datum.getName()).append(" ").append(datum.getOwner()).append(System.lineSeparator());
        }

        return sb.toString().trim();
    }



}
