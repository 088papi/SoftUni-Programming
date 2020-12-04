import java.util.Scanner;

public class Task5_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

String product = scanner.nextLine();
int quantity = Integer.parseInt(scanner.nextLine());
double price;

switch (product){
    case "coffee":
        price = 1.50;
        printPrice(quantity, price );
        break;
    case "water":
        price = 1.00;
        printPrice(quantity, price );
        break;
    case "coke":
        price = 1.40;
        printPrice(quantity, price );
        break;
    case "snacks":
        price = 2.00;
        printPrice(quantity, price );
        break;
}

    }

    public static void printPrice(int a, double b) {
      double result = a * b;
        System.out.printf("%.2f", result);
    }
}
