import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Pattern pattern = Pattern.compile("(?<model>[A-Za-z0-9]+) (?<engine>\\d+ \\d+ )(?<cargoInfo>\\d+ [a-z]+) (?<tires>[\\d+]*[.]?\\d+ \\d+ [\\d+]*[.]?\\d+ \\d+ [\\d+]*[.]?\\d+ \\d+ [\\d+]*[.]?\\d+ \\d+)");

        List<Car> cars = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String model = matcher.group("model");
                String[] engineData = matcher.group("engine").split(" ");
                String[] cargoType = matcher.group("cargoInfo").split(" ");
                String[] tires = matcher.group("tires").split(" ");

                Engine engine = setEngine(engineData);
                Cargo cargo = setCargo(cargoType);
                List<Tire> tyres = setTyres(tires);

                Car car = new Car();

                car.setModel(model);
                car.setEngine(engine);
                car.setCargo(cargo);
                car.setTires(tyres);

                cars.add(car);
            }
        }


        String command = scanner.nextLine();

        if (command.equals("fragile")) {
            cars.forEach(car -> {
                String type = car.getCargo().getType();
                if (command.equals(type)) {

                    boolean isFragile = false;

                    for (Tire tire : car.getTires()) {
                        if (tire.getPressure() < 1){
                            isFragile = true;
                            break;
                        }
                    }

                    if (isFragile) {
                        System.out.println(car.getModel());
                    }
                }
            });
        } else if (command.equals("flamable")) {
            cars.forEach(car -> {
                String type = car.getCargo().getType();
                if (command.equals(type)) {
                    int enginePower = car.getEngine().getEnginePower();
                    if (enginePower > 250) {
                        System.out.println(car.getModel());
                    }


                }
            });
        }
    }





    private static Engine setEngine(String[] engineData) {
        Engine engine = new Engine();

        int speed = Integer.parseInt(engineData[0]);
        int power = Integer.parseInt(engineData[1]);
        engine.setEngineSpeed(speed);
        engine.setEnginePower(power);
        return engine;
    }

    private static Cargo setCargo(String[] cargoType) {
        Cargo cargo = new Cargo();
        int weight = Integer.parseInt(cargoType[0]);
        String type = cargoType[1];
        cargo.setWeight(weight);
        cargo.setType(type);
        return cargo;
    }

    private static List<Tire> setTyres(String[] tires) {
        List<Tire> tyres = new ArrayList<>();
        Tire tire1 = new Tire();
        Tire tire2 = new Tire();
        Tire tire3 = new Tire();
        Tire tire4 = new Tire();

        double pTyre1 = Double.parseDouble(tires[0]);
        int ageTyre1 = Integer.parseInt(tires[1]);
        tire1.setPressure(pTyre1);

        tire1.setAge(ageTyre1);
        double pTyre2 = Double.parseDouble(tires[2]);
        int ageTyre2 = Integer.parseInt(tires[3]);
        tire2.setPressure(pTyre2);
        tire2.setAge(ageTyre2);

        double pTyre3 = Double.parseDouble(tires[4]);
        int ageTyre3 = Integer.parseInt(tires[5]);
        tire3.setPressure(pTyre3);
        tire3.setAge(ageTyre3);

        double pTyre4 = Double.parseDouble(tires[6]);
        int ageTyre4 = Integer.parseInt(tires[7]);
        tire4.setPressure(pTyre4);
        tire4.setAge(ageTyre4);

        tyres.add(tire1);
        tyres.add(tire2);
        tyres.add(tire3);
        tyres.add(tire4);
        return tyres;
    }
}
