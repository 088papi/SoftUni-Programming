import java.util.Scanner;
//100/100
public class Task2_AsciiSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();
        String givenString = scanner.nextLine();

        char firstChar = input1.charAt(0);
        char secondChar = input2.charAt(0);

        int sum = 0;

        for (int i = 0; i < givenString.length(); i++) {
            char currentChar = givenString.charAt(i);

        if (firstChar < currentChar && currentChar < secondChar) {
            sum += currentChar;
        }
        }

        System.out.println(sum);
    }
}
