import java.util.Scanner;

public class Ex11_FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String weekDay = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double totalPrice = 0;

        if (fruit.equals("banana")) {
            switch (weekDay) {
                case "Monday":
                case "Tuesday":
                case "Wednesday":
                case "Thursday":
                case "Friday":
                    totalPrice = quantity * 2.50;
                    System.out.printf("%.2f", totalPrice);
                    break;
                case "Saturday":
                case "Sunday":
                    totalPrice = quantity * 2.70;
                    System.out.printf("%.2f", totalPrice);
                    break;
                default: System.out.println("error");
            }
        } else if (fruit.equals("apple")) {
            switch (weekDay) {
                case "Monday":
                case "Tuesday":
                case "Wednesday":
                case "Thursday":
                case "Friday":
                    totalPrice = quantity * 1.20;
                    System.out.printf("%.2f", totalPrice);
                    break;
                case "Saturday":
                case "Sunday":
                    totalPrice = quantity * 1.25;
                    System.out.printf("%.2f", totalPrice);
                    break;
                default:System.out.println("error");
            }
        } else if (fruit.equals("orange")) {
            switch (weekDay) {
                case "Monday":
                case "Tuesday":
                case "Wednesday":
                case "Thursday":
                case "Friday":
                    totalPrice = quantity * 0.85;
                    System.out.printf("%.2f", totalPrice);
                    break;
                case "Saturday":
                case "Sunday":
                    totalPrice = quantity * 0.90;
                    System.out.printf("%.2f", totalPrice);
                    break;
                default:System.out.println("error");
            }
        } else if (fruit.equals("grapefruit")) {
            switch (weekDay) {
                case "Monday":
                case "Tuesday":
                case "Wednesday":
                case "Thursday":
                case "Friday":
                    totalPrice = quantity * 1.45;
                    System.out.printf("%.2f", totalPrice);
                    break;
                case "Saturday":
                case "Sunday":
                    totalPrice = quantity * 1.60;
                    System.out.printf("%.2f", totalPrice);
                    break;
                default:System.out.println("error");
            }
        } else if (fruit.equals("kiwi")) {
            switch (weekDay) {
                case "Monday":
                case "Tuesday":
                case "Wednesday":
                case "Thursday":
                case "Friday":
                    totalPrice = quantity * 2.70;
                    System.out.printf("%.2f", totalPrice);
                    break;
                case "Saturday":
                case "Sunday":
                    totalPrice = quantity * 3.00;
                    System.out.printf("%.2f", totalPrice);
                    break;
                default:System.out.println("error");
            }
        } else if (fruit.equals("pineapple")) {
            switch (weekDay) {
                case "Monday":
                case "Tuesday":
                case "Wednesday":
                case "Thursday":
                case "Friday":
                    totalPrice = quantity * 5.50;
                    System.out.printf("%.2f", totalPrice);
                    break;
                case "Saturday":
                case "Sunday":
                    totalPrice = quantity * 5.60;
                    System.out.printf("%.2f", totalPrice);
                    break;
                default:System.out.println("error");
            }
        } else if (fruit.equals("grapes")) {
            switch (weekDay) {
                case "Monday":
                case "Tuesday":
                case "Wednesday":
                case "Thursday":
                case "Friday":
                    totalPrice = quantity * 3.85;
                    System.out.printf("%.2f", totalPrice);
                    break;
                case "Saturday":
                case "Sunday":
                    totalPrice = quantity * 4.20;
                    System.out.printf("%.2f", totalPrice);
                    break;
                default:System.out.println("error");
            }

        } else {
            System.out.println("error");
        }
    }
}

