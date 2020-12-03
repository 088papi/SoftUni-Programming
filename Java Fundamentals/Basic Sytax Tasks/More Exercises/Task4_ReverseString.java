import java.util.Scanner;
// 100/100
public class Task4_ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();

        for (int i = string.length() - 1; i >= 0; i--) {
            char letter = string.charAt(i);

            System.out.print(letter);
        }


    }
}
