import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Task10_PopulationCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Map<String, Long>> populationInfo = new LinkedHashMap();
        while (!input.equals("report")) {
            String[] data = input.split("\\|");
            String city = data[0];
            String country = data[1];
            long population = Long.parseLong(data[2]);

            populationInfo.putIfAbsent(country, new LinkedHashMap<>());
            populationInfo.get(country).putIfAbsent(city, population);



            input = scanner.nextLine();
        }
        populationInfo.entrySet().stream().sorted((c1, c2) -> {
            long p1 = c1.getValue().values().stream().mapToLong(l -> l).sum();
            long p2 = c2.getValue().values().stream().mapToLong(e -> e).sum();
            return Long.compare(p2, p1);
        }).forEach(c -> {
            Long totalPopulation = c.getValue().values().stream().mapToLong(e -> e).sum();
            System.out.println(String.format("%s (total population: %d)", c.getKey(), totalPopulation));
            Map<String, Long> cityInfo = c.getValue();
            cityInfo.entrySet().stream().sorted((a, b) -> Long.compare(b.getValue(), a.getValue()))
                    .forEach(s -> System.out.println(String.format("=>%s: %d", s.getKey(), s.getValue())));
        });

    }
}

