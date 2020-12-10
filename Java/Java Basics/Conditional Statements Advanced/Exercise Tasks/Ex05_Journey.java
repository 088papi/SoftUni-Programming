import java.util.Scanner;

// РЕШЕНО - 100/100
public class Ex05_Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double price = 0;

        if (budget <= 100 && season.equals("summer")) { // Bulgaria
            price = 0.3 * budget;
            System.out.println("Somewhere in Bulgaria");
            System.out.printf("Camp - %.2f", price);
        } else if (budget <= 100 && season.equals("winter")) {
            price = 0.7 * budget;
            System.out.println("Somewhere in Bulgaria");
            System.out.printf("Hotel - %.2f", price);
        } else if ((budget > 100 && budget <= 1000) && season.equals("summer")) {
            price = 0.4 * budget;
            System.out.println("Somewhere in Balkans");
            System.out.printf("Camp - %.2f", price);
        } else if ((budget > 100 && budget <= 1000) && season.equals("winter")) {
            price = 0.8 * budget;
            System.out.println("Somewhere in Balkans");
            System.out.printf("Hotel - %.2f", price);
        } else if (budget > 1000 && ((season.equals("summer") || season.equals("winter")))) {
            price = 0.9 * budget;
            System.out.println("Somewhere in Europe");
            System.out.printf("Hotel - %.2f", price);


        }
    }
}
