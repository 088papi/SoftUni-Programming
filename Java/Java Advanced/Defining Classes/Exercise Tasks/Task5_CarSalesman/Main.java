import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Car, Engine> carEngineMap = new LinkedHashMap<>();

        int engineNumber = Integer.parseInt(scanner.nextLine());

        List<Engine> engineList = new ArrayList<>();
        List<Car> carList = new ArrayList<>();



        for (int i = 0; i < engineNumber; i++) {
            String input = scanner.nextLine();
            String[] data = input.split("\\s+");
            String model = data[0];
            String power = data[1];
            String displacement;
            String efficiency;

            Engine engine = new Engine();

            if (data.length == 4) {
                displacement = data[2];
                efficiency = data[3];

                engine.setModel(model);
                engine.setPower(power);
                engine.setDisplacement(displacement);
                engine.setEfficiency(efficiency);


            } else if (data.length == 3){
                if (Character.isLetter(data[2].charAt(0))){
                    efficiency = data[2];
                    engine.setModel(model);
                    engine.setPower(power);
                    engine.setEfficiency(efficiency);
                } else {
                    displacement = data[2];
                    engine.setModel(model);
                    engine.setPower(power);
                    engine.setDisplacement(displacement);
                }
            } else {
                engine.setModel(model);
                engine.setPower(power);
            }
            engineList.add(engine);

        }

        int carNumber = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < carNumber; i++) {
           String input = scanner.nextLine();
            String[] data = input.split("\\s+");
            String model = data[0];
            String engineName = data[1];
            Car car = new Car();

            Engine engine = null;

            for (Engine engine1 : engineList) {
                if (engineName.equals(engine1.getModel()))
                    engine = engine1;

            }


            if (data.length == 4){
                car.setModel(model);
                car.setEngine(engine);
                car.setWeight(data[2]);
                car.setColor(data[3]);
            } else if (data.length == 3) {
                if (Character.isLetter(data[2].charAt(0))){
                    String color = data[2];
                    car.setModel(model);
                    car.setEngine(engine);
                    car.setColor(color);

                } else {
                    String weight = data[2];
                    car.setModel(model);
                    car.setEngine(engine);
                    car.setWeight(weight);
                }
            } else {
                car.setModel(model);
                car.setEngine(engine);
            }
            carList.add(car);
        }

        for (Car car : carList) {
            System.out.print(car.toString());
        }

    }
}
