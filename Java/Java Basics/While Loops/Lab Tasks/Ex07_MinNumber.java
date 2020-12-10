import java.util.Scanner;
// РЕШЕНО - 100/100
public class Ex07_MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        int min = Integer.MAX_VALUE;

        while (!input.equals("Stop")) {
            int current = Integer.parseInt(input);
            if (current <= min) {
                min = current;

            }
            input = scanner.nextLine();
        } System.out.println(min);


    }
}
