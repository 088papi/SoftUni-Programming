import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task13_SrabskoUnleashed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "(?<singer>([A-Za-z]+\\s){1,3})@(?<venue>([A-Za-z]+\\s){1,3})(?<ticketsPrice>\\d+)\\s(?<ticketsCount>\\d+)";

        Pattern pattern = Pattern.compile(regex);
        Map<String, Map<String, Integer>> artistsVenueAndIncome = new LinkedHashMap<>();
        String input = scanner.nextLine();

        while (!input.equals("End")) {
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {

                String name = matcher.group("singer").trim();
                String venue = matcher.group("venue").trim();
                int ticketsPrice = Integer.parseInt(matcher.group("ticketsPrice"));
                int ticketsCount = Integer.parseInt(matcher.group("ticketsCount"));

                Integer totalIncome = ticketsCount * ticketsPrice;


                if (!artistsVenueAndIncome.containsKey(venue)) {
                    artistsVenueAndIncome.put(venue, new LinkedHashMap<>());
                    artistsVenueAndIncome.get(venue).put(name, totalIncome);
                } else {
                    if (artistsVenueAndIncome.get(venue).containsKey(name)) {
                        int sold = artistsVenueAndIncome.get(venue).get(name) + totalIncome;
                        artistsVenueAndIncome.get(venue).put(name, sold);
                    } else {
                        artistsVenueAndIncome.get(venue).put(name, totalIncome);
                    }

                }


            }


            input = scanner.nextLine();
        }


        artistsVenueAndIncome.entrySet().forEach(a -> {
            System.out.println(a.getKey());
            a.getValue().entrySet().stream().sorted((b, c) -> {
                int result = c.getValue().compareTo(b.getValue());
                if (result == 0){
                    result = b.getValue().compareTo(c.getValue());
                }
                return result;
            }).forEach((d) -> System.out.printf("#  %s -> %d%n", d.getKey(), d.getValue()));


        });


    }
}
