import java.util.Scanner;
//100/100
public class Task04_ReverseAnArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] s = scanner.nextLine().split(" ");

        for (int i = 0; i < s.length / 2; i++) {
            String elements = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length-1-i] = elements;
        }
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }

    }
}
