package healthyHeaven;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private List<Salad> data;
    private String name;

    public Restaurant(String name) {
        this.name = name;
        this.data = new ArrayList<>();
    }

    public void add(Salad salad){
        this.data.add(salad);
    }

    public boolean buy(String name){
       return this.data.removeIf(e-> e.getName().equals(name));
    }

    public Salad getHealthiestSalad(){
        Salad healthiestSalad = null;
        int healthiest = Integer.MAX_VALUE;
        for (Salad datum : this.data) {
            if (datum.getTotalCalories() < healthiest ){
                healthiest = datum.getTotalCalories();
                healthiestSalad = datum;
            }
        }
        return healthiestSalad;
    }


    public String generateMenu(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.name).append(" have ").append(this.data.size()).append(" salads:").append(System.lineSeparator());
        for (Salad datum : this.data) {
            sb.append(datum.toString()).append(System.lineSeparator());
        }


        return sb.toString().trim();
    }
}
