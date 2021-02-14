package christmas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Bag {
    private List<Present> data;
    private String color;
    private int capacity;

    public Bag(String color, int capacity) {
        this.data = new ArrayList<>();
        this.color = color;
        this.capacity = capacity;
    }

    public String getColor() {
        return this.color;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int count() {
        return this.data.size();
    }

    public void add(Present present) {
        if (capacity > this.data.size()) {
            this.data.add(present);
        }
    }

    public boolean remove(String name) {
        return data.removeIf(e -> e.getName().equals(name));
    }

    public Present heaviestPresent() {
        Present present = null;
        double heaviest = 0;
        for (Present datum : data) {
            if (datum.getWeight() > heaviest) {
                heaviest = datum.getWeight();
                present = datum;
            }
        }

        return present;
    }

    public Present getPresent(String name){
        Present present = null;
        for (Present datum : this.data) {
            if (datum.getName().equals(name)){
                present = datum;
                break;
            }
        }
        return present;
    }



    public String report(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.color.substring(0,1).toUpperCase(Locale.ROOT))
                .append(this.color.substring(1,this.color.length()))
                .append(" bag contains:").append(System.lineSeparator());
        for (Present datum : data) {
            sb.append(datum.toString());
            sb.append(System.lineSeparator());
        }



        return sb.toString().trim();
    }

}
