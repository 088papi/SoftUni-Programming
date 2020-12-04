import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//100/100;
public class Task3_NeedForSpeed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> carMileage = new HashMap<>();
        Map<String, Integer> carFuel = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] data = input.split("\\|");
            String carName = data[0];
            int mileage = Integer.parseInt(data[1]);
            int fuel = Integer.parseInt(data[2]);


            carMileage.put(carName, mileage);
            carFuel.put(carName, fuel);
        }

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Stop")) {
                break;
            }

            String[] data = input.split(" : ");
            String command = data[0];
            String carName = data[1];

            switch (command) {
                case "Drive":
                    int distance = Integer.parseInt(data[2]);
                    int fuel = Integer.parseInt(data[3]);

                    if (carFuel.get(carName) >= fuel) {
                        carFuel.put(carName, carFuel.get(carName) - fuel);
                        carMileage.put(carName, carMileage.get(carName) + distance);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", carName, distance, fuel);
                        if (carMileage.get(carName) >= 100000) {
                            carFuel.remove(carName);
                            carMileage.remove(carName);
                            System.out.println("Time to sell the " + carName + "!");
                        }


                    } else {
                        System.out.println("Not enough fuel to make that ride");
                    }
                    break;
                case "Refuel":
                    int fuelToRefill = Integer.parseInt(data[2]);

                    int currentFuel = carFuel.get(carName);

                    if (fuelToRefill <= 75) {
                        int allFuel = fuelToRefill + currentFuel;
                        int refilledFuel = 0;

                        if (allFuel <= 75) {
                            carFuel.put(carName, allFuel);
                            refilledFuel = fuelToRefill;
                        } else {
                            carFuel.put(carName, 75);
                            refilledFuel = 75 - currentFuel;
                        }

                        System.out.printf("%s refueled with %d liters%n", carName, refilledFuel);
                    }
                    break;
                case "Revert":
                    int kms = Integer.parseInt(data[2]);
                    int currentKm = carMileage.get(carName);
                    carMileage.put(carName, currentKm - kms);
                    if (carMileage.get(carName) < 10000) {
                        carMileage.put(carName, 10000);
                    } else {
                        System.out.printf("%s mileage decreased by %d kilometers%n", carName, kms);
                    }
                    break;
            }
        }

        carMileage.entrySet()
                .stream()
                .sorted((a, b) -> a.getKey().compareTo(b.getKey()))
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .forEach(a -> System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", a.getKey(), a.getValue(), carFuel.get(a.getKey())));


    }
}
