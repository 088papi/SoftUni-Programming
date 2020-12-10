import java.awt.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//100/100
public class Task3_MatchDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "\\b(?<day>\\d{2})([./-])(?<month>[A-Z][a-z]+)\\2(?<year>\\d{4})\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.print("Day: " + matcher.group("day"));
            System.out.print(", Month: " + matcher.group("month"));
            System.out.print(", Year: " + matcher.group("year"));
            System.out.println();
        }
        //
    }
}
