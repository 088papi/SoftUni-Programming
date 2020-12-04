import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//100/100


public class Task2_AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "([|#])(?<name>[A-Za-z\\s]+)\\1(?<bestBefore>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<calories>\\d{1,5})\\1";

        List<String> foodName = new ArrayList<>();
        List<String> expDates = new ArrayList<>();
        List<Integer> allCalories = new ArrayList<>();

        int sumCalories = 0;
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            String foodType = matcher.group("name");
            String expDate = matcher.group("bestBefore");
            int calories = Integer.parseInt(matcher.group("calories"));
            foodName.add(foodType);
            expDates.add(expDate);
            allCalories.add(calories);
            sumCalories += Integer.parseInt(matcher.group("calories"));

        }

        int days = sumCalories / 2000;


        System.out.printf("You have food to last you for: %d days!%n", days);
        for (int i = 0; i <foodName.size() ; i++) {
            System.out.printf("Item: %s, Best before: %s, Nutrition: %d%n", foodName.get(i), expDates.get(i), allCalories.get(i));


        }

    }
}
