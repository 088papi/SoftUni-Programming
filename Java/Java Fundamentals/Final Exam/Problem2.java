import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//100/100
public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <n ; i++) {

            String input = scanner.nextLine();

            String regex = "^([$%])(?<tag>[A-Z][a-z]{2,})\\1: \\[(?<one>\\d+)\\]\\|\\[(?<two>\\d+)\\]\\|\\[(?<three>\\d+)\\]\\|$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            if (!matcher.find()) {
                System.out.println("Valid message not found!");
            } else {
                char a = (char)(Integer.parseInt(matcher.group("one")));
                char b = (char)(Integer.parseInt(matcher.group("two")));
                char c = (char)(Integer.parseInt(matcher.group("three")));

                String msg = Character.toString(a) + Character.toString(b) + Character.toString(c);

                System.out.printf("%s: %s%n", matcher.group("tag"), msg);
            }
        }
    }
}
