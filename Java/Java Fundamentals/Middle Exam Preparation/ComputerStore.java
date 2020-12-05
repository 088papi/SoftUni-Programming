import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//100/100

        double totalPrice = 0;
        double totalPriceWithoutTax = 0;
        double taxes = 0;
        double totalTaxes = 0;
        String input = scanner.nextLine();

        while (true) {
if (input.equals("regular") || input.equals("special")) {
    break;
            }


            double priceProductWithoutTax = Double.parseDouble(input);

            if (priceProductWithoutTax < 0) {
                System.out.println("Invalid price!");
                input = scanner.nextLine();
                continue;
            }
            totalPriceWithoutTax += priceProductWithoutTax;
            if (totalPriceWithoutTax == 0) {
                System.out.println("Invalid order!");
            }
            taxes += 0.20 * priceProductWithoutTax;


            input = scanner.nextLine();
        }
        totalPrice = totalPriceWithoutTax + taxes;
            if (input.equals("special")) {
                if (totalPrice == 0) {
                    System.out.println("Invalid order!");
                    return;
                }
                totalPrice = totalPrice - 0.10 * totalPrice;
                System.out.printf("Congratulations you've just bought a new computer!%n");
                System.out.printf("Price without taxes: %.2f$%n", totalPriceWithoutTax);
                System.out.printf("Taxes: %.2f$%n", taxes);
                System.out.printf("-----------%n");
                System.out.printf("Total price: %.2f$%n", totalPrice);
                return;
            }
            if (input.equals("regular")) {
                if (totalPrice == 0) {
                    System.out.println("Invalid order!");
                    return;
                }

                System.out.printf("Congratulations you've just bought a new computer!%n");
                System.out.printf("Price without taxes: %.2f$%n", totalPriceWithoutTax);
                System.out.printf("Taxes: %.2f$%n", taxes);
                System.out.printf("-----------%n");
                System.out.printf("Total price: %.2f$%n", totalPrice);
            }
    }
}

