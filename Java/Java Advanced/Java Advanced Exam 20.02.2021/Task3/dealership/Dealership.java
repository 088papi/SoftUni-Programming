package dealership;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private int capacity;
    private List<Car> data;


    public Dealership(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void add(Car car) {
        if (this.capacity > this.data.size()) {
            this.data.add(car);
        }
    }

    public boolean buy(String manufacturer, String model) {
        boolean isSold = false;
        Car car = null;
        for (Car datum : data) {
            if (datum.getManufacturer().equals(manufacturer)
            && datum.getModel().equals(model)){
                car = datum;
            }
        }

        if (this.data.contains(car)){
            this.data.remove(car);
            isSold = true;
        }

        return isSold;
    }

    public Car getLatestCar() {

        Car car = null;
        int latestYear = Integer.MIN_VALUE;

        for (Car datum : data) {
            if (datum.getYear() > latestYear) {
                car = datum;
                latestYear = datum.getYear();
            }
        }

        return car;

    }


    public Car getCar(String manufacturer, String model) {

        return this.data.stream().filter(e -> e.getManufacturer().equals(manufacturer)
                && e.getModel().equals(model)).findFirst().orElse(null);
    }


    public int getCount() {
        return this.data.size();
    }

    public String getStatistics() {
        StringBuilder sb = new StringBuilder();
        sb.append("The cars are in a car dealership ")
                .append(this.name).append(":")
                .append(System.lineSeparator());

        for (Car datum : this.data) {
            sb.append(datum.toString())
                    .append(System.lineSeparator());
        }


        return sb.toString().trim();
    }

}
