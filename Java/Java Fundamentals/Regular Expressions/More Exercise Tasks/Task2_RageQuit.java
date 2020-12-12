import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//100/100
public class Task2_RageQuit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().trim();

        Pattern pattern = Pattern.compile("(?<string>[^0-9]*)(?<count>\\d+)");
        Matcher matcher = pattern.matcher(input);
        StringBuilder msg = new StringBuilder();


        while (matcher.find()) {
            String word = matcher.group("string").toUpperCase();
            int count = Integer.parseInt(matcher.group("count"));

            for (int i = 0; i <count ; i++) {
                msg.append(word);
            }
        }



        System.out.println("Unique symbols used: " + msg.chars().distinct().count());
        System.out.println(msg);


    }
}
