import java.util.Scanner;
// РЕШЕНО - 100/100;
public class Ex05_Balance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double sum = 0.00;


        while (!input.equals("NoMoreMoney")) {
            double sumInput = Double.parseDouble(input);
            if (sumInput < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            sum = sum + sumInput;
            System.out.printf("Increase: %.2f%n", sumInput);
            input = scanner.nextLine();

        }
        System.out.printf("Total: %.2f", sum);


    }
}
