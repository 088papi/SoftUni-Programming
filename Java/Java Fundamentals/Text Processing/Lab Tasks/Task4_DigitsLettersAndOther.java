import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//100/100
public class Task4_DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Character> digits = new ArrayList<>();
        List<Character> letters = new ArrayList<>();
        List<Character> chars = new ArrayList<>();

        char[] characters = input.toCharArray();
        for (char symbols: characters) {
            if (Character.isDigit(symbols)) {
                digits.add(symbols);
        } else if (Character.isLetter(symbols)) {
                letters.add(symbols);
            } else {
                chars.add(symbols);
            }


        }


        digits.stream()
                .forEach(System.out::print);
        System.out.println();
       letters.stream()
               .forEach(System.out::print);
        System.out.println();
        chars.stream()
               .forEach(System.out::print);
    }
}
