import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Car> cars = new LinkedHashMap<>();
        for (int i = 0; i <n ; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            Car car = new Car();
            car.setModel(data[0]);
            car.setFuelAmount(Double.parseDouble(data[1]));
            car.setFuelCost1km(Double.parseDouble(data[2]));

            cars.putIfAbsent(data[0], car);
        }


        String input = scanner.nextLine();

        while (!input.equals("End")){
            String[] data = input.split("\\s+");
            String carModel = data[1];
            int amountOfKm = Integer.parseInt(data[2]);

            double totalAmountOfKm = amountOfKm + cars.get(carModel).getDistanceTraveled();


            cars.get(carModel).travel(
                    cars.get(carModel).getFuelAmount(),
                    cars.get(carModel).getFuelCost1km(),
                    amountOfKm);





            input = scanner.nextLine();
        }


        cars.forEach((key, value) -> System.out.printf("%s %.2f %.0f%n", value.getModel(),
                value.getFuelAmount(), value.getDistanceTraveled()));

    }
}
