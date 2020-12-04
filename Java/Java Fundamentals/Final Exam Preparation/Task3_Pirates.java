import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

//100/100
public class Task3_Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> townPopulation = new HashMap<>();
        Map<String, Integer> townGold = new HashMap<>();

        while (true) {
            String firstInput = scanner.nextLine().trim();

            if (firstInput.equals("Sail")) {
                break;
            }
            String[] cityData = firstInput.split("\\|\\|");
            String cityName = cityData[0];
            int population = Integer.parseInt(cityData[1]);
            int gold = Integer.parseInt(cityData[2]);

            if (townPopulation.containsKey(cityName)) {
                townPopulation.put(cityName, townPopulation.get(cityName) + population);
            } else {
                townPopulation.put(cityName, population);
            }

            if (townGold.containsKey(cityName)) {
                townGold.put(cityName, townGold.get(cityName) + gold);
            } else {
                townGold.put(cityName, gold);
            }

        }

        while (true) {
            String secondInput = scanner.nextLine().trim();
            if (secondInput.equals("End")) {
                break;
            }

            String[] data = secondInput.split("=>");
            String command = data[0];
            String townName = data[1];
            switch (command) {
                case "Plunder":
                    int people = Integer.parseInt(data[2]);
                    int gold = Integer.parseInt(data[3]);


                    townPopulation.put(townName, townPopulation.get(townName) - people);
                    townGold.put(townName, townGold.get(townName) - gold);


                    System.out.printf("%s plundered!" +
                            " %d gold stolen, %d citizens killed.%n", townName, gold, people);
                    if (townPopulation.get(townName) == 0 || townGold.get(townName) == 0) {
                        townGold.remove(townName);
                        townPopulation.remove(townName);
                        System.out.printf("%s has been wiped off the map!%n", townName);
                    }


                    break;
                case "Prosper":
                    gold = Integer.parseInt(data[2]);

                    if (gold >= 0) {
                        townGold.put(townName, townGold.get(townName) + gold);

                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n",
                                gold, townName, townGold.get(townName));
                    } else {
                        System.out.println("Gold added cannot be a negative number!");
                    }

                    break;
            }


        }

        if (townGold.size() == 0 || townPopulation.size() == 0) {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        } else {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", townGold.size());


            townGold.entrySet()
                    .stream()
                    .sorted((a, b) -> a.getKey().compareTo(b.getKey()))
                    .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                    .forEach(e -> System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n", e.getKey(), townPopulation.get(e.getKey()), e.getValue()));

        }
    }
}

