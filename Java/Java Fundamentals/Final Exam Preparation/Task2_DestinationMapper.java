import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//100/100
public class Task2_DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "([=/])(?<destination>[A-Z][A-Za-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(input);
        int sum = 0;
        List<String> destinations = new ArrayList<>();
        while (matcher.find()) {
            String country = matcher.group("destination");
            sum += country.length();
            destinations.add(country);
        }
        System.out.print("Destinations: ");
        System.out.print(String.join(", ", destinations));
        System.out.println();
        System.out.println("Travel Points: " + sum);
    }
}
