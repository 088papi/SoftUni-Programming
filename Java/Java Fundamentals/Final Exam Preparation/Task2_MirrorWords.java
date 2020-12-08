import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//100/100
public class Task2_MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String regex = "([@|#]+)(?<wordOne>[A-Za-z]{3,})\\1\\1(?<wordTwo>[a-zA-Z]{3,})\\1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int countMatcher = 0;
        List<String> mirrorWords = new ArrayList<>();

        while (matcher.find()) {
            countMatcher++;
            String firstWord = matcher.group("wordOne");
            String secondWord = matcher.group("wordTwo");

            boolean isTheSame = false;

            if (firstWord.equals(ReverseString(secondWord))) {
                isTheSame = true;
                String mirrorPair = firstWord + " <=> " + secondWord;
                mirrorWords.add(mirrorPair);
            }




        }


        if (mirrorWords.isEmpty()) {
           if (countMatcher ==0) {
               System.out.println("No word pairs found!");
               System.out.println("No mirror words!");
           } else {
               System.out.printf("%d word pairs found!%n", countMatcher);
               System.out.println("No mirror words!");
           }

        } else {
            System.out.printf("%d word pairs found!%n", countMatcher);
            System.out.println("The mirror words are:");
            System.out.println(String.join(", ", mirrorWords));

        }

    }


    public static String ReverseString(String word) {
        String reversedWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }

        return reversedWord;
    }

}



