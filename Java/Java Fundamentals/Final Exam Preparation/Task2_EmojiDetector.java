import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//100/100
public class Task2_EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "[:]{2}([A-Z][a-z]{2,})[:]{2}|[*]{2}[A-Z][a-z]{2,}[*]{2}";
        String regexForDigit = "\\d";

        int coolThreshold = 1;

        Pattern patternForDigit = Pattern.compile(regexForDigit);
        Matcher matcherForDigit = patternForDigit.matcher(input);

        while (matcherForDigit.find()) {
            int digit = Integer.parseInt(matcherForDigit.group());
            coolThreshold *= digit;
        }

        Pattern patternForEmojis = Pattern.compile(regex);
        Matcher emojiMatcher = patternForEmojis.matcher(input);

        List<String> allEmoji = new ArrayList<>();
        List<String> coolEmoji = new ArrayList<>();

        while (emojiMatcher.find()) {
            String name = emojiMatcher.group();
            int sumChar = 0;

            for (int i = 2; i <name.length()-2 ; i++) {
                char sign = name.charAt(i);
                sumChar+=(int)sign;
            }
            allEmoji.add(name);

        if (sumChar > coolThreshold) {
            coolEmoji.add(name);
        }


        }
        System.out.println("Cool threshold: "+ coolThreshold);
        System.out.println(allEmoji.size() + " emojis found in the text. The cool ones are:");
        for (String s: coolEmoji) {
            System.out.printf("%s%n",s);

        }
    }
}
