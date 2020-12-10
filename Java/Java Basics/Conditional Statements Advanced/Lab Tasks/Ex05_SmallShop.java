import java.util.Scanner;
// РЕШЕНО - ПРОВЕРИ В ДЖЪДЖ - 0/100
public class Ex05_SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine().toLowerCase();
        String town = scanner.nextLine().toLowerCase();
        double quantity = Double.parseDouble(scanner.nextLine());
        double totalPrice = 0;
        if (product.equals("coffee")) {
            switch ("town") {
                case "Sofia":
                    totalPrice = quantity * 0.50;
                    System.out.printf("%f.2f", totalPrice);
                    break;
                case "Plovdiv":
                    totalPrice = quantity * 0.40;
                    System.out.printf("%f.2f", totalPrice);
                    break;
                case "Varna":
                    totalPrice = quantity * 0.45;
                    System.out.printf("%f.2f", totalPrice);
                    break;
            }

        } else if (product.equals("water")) {
            switch ("city") {
                case "Sofia":
                    totalPrice = quantity * 0.80;
                    System.out.printf("%f.2f", totalPrice);
                    break;
                case "Plovdiv":
                    totalPrice = quantity * 0.70;
                    System.out.printf("%f.2f", totalPrice);
                    break;
                case "Varna":
                    totalPrice = quantity * 0.70;
                    System.out.printf("%f.2f", totalPrice);
                    break;
            }
        } else if (product.equals("beer")) {
            switch ("town") {
                case "Sofia":
                    totalPrice = quantity * 1.20;
                    System.out.printf("%f.2f", totalPrice);
                    break;
                case "Plovdiv":
                    totalPrice = quantity * 1.15;
                    System.out.printf("%f.2f", totalPrice);
                    break;
                case "Varna":
                    totalPrice = quantity * 1.10;
                    System.out.printf("%f.2f", totalPrice);
                    break;
            }
        } else if (product.equals("sweets")) {
            switch ("town") {
                case "Sofia":
                    totalPrice = quantity * 1.45;
                    System.out.printf("%f.2f", totalPrice);
                    break;
                case "Plovdiv":
                    totalPrice = quantity * 1.30;
                    System.out.printf("%f.2f", totalPrice);
                    break;
                case "Varna":
                    totalPrice = quantity * 1.35;
                    System.out.printf("%f.2f", totalPrice);
                    break;
            }
        } else if (product.equals("peanuts")) {
            switch ("town") {
                case "Sofia":
                    totalPrice = quantity * 1.60;
                    System.out.printf("%f.2f", totalPrice);
                    break;
                case "Plovdiv":
                    totalPrice = quantity * 1.50;
                    System.out.printf("%f.2f", totalPrice);
                    break;
                case "Varna":
                    totalPrice = quantity * 1.55;
                    System.out.printf("%f.2f", totalPrice);
                    break;
            }

        }
    }
}


