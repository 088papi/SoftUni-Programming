import java.util.Scanner;

public class Task1_ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

///100/100
while (true) {
    String reversed = "";

    String input = scanner.nextLine();
    if (input.equals("end")) {
        break;
    }

    for (int i = input.length() - 1; i >= 0 ; i--) {
            reversed+=input.charAt(i);
    }
    System.out.printf("%s = %s%n", input, reversed);




}

    }
}
