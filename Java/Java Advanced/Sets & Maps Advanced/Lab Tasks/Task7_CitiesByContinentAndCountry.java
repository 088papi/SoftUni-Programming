import java.util.*;
import java.util.stream.Collectors;

public class Task7_CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());


        Map<String, Map<String, List<String>>> info = new LinkedHashMap<>();


        while (n-- > 0) {
            String[] data = scanner.nextLine().split("\\s+");
            String continent = data[0];
            String country = data[1];
            String city = data[2];

            info.putIfAbsent(continent, new LinkedHashMap<>());
            info.get(continent).putIfAbsent(country, new ArrayList<>());
            info.get(continent).get(country).add(city);
        }

        info.entrySet().stream()
                .forEach(entry -> {
                    System.out.println(entry.getKey() + ":");
                    entry.getValue().forEach((country, city) -> {
                        System.out.println(" " +  country + " -> " + String.join(", ", city));
                    });


                });


    }
}
