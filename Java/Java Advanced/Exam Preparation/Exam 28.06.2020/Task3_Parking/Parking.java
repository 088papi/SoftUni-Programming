package parking;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public class Parking {
       private List<Car> data;
       private String type;
       private int capacity;

        public Parking(String type, int capacity){
            data = new ArrayList<>();
            this.type = type;
            this.capacity = capacity;
        }

        public void add(Car car){
            if (capacity > data.size()){
                data.add(car);
            }
        }

        public boolean remove(String manufacturer, String model){
            for (Car datum : data) {
                if (datum.getManufacturer().equals(manufacturer)
                && datum.getModel().equals(model)){
                    data.remove(datum);
                    return true;
                }
            }
            return false;
        }

        public Car getLatestCar(){

            Car bestYearCar = null;
            int bestYear = 0;


            if (data.size() != 0){
                for (Car car : data) {
                    if (car.getYear() >= bestYear){
                        bestYear = car.getYear();
                        bestYearCar = car;

                    }
                }
                return bestYearCar;
            }

            return null;
        }


        public Car getCar(String manufacturer, String model){
            Car carToReturn = null;

            for (Car datum : data) {
                if (datum.getManufacturer().equals(manufacturer)
                && datum.getModel().equals(model)){
                    carToReturn = datum;
                    return carToReturn;
                }
            }

            return null;
        }

        public int getCount(){
            return data.size();
        }

        public String getStatistics(){
            StringBuilder sb = new StringBuilder();
            sb.append("The cars are parked in ").append(type).append(":").append(System.lineSeparator());

            for (int i = 0; i <= data.size()-1; i++) {
                sb.append(data.get(i).toString());
                if (i != data.size()-1){
                    sb.append(System.lineSeparator());
                }
            }
            return sb.toString();
        }
}
