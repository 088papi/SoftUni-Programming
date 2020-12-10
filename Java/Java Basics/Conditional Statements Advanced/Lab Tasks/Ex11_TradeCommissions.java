import java.util.Scanner;

public class Ex11_TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        double sells = Double.parseDouble(scanner.nextLine());

        double commissions = 0.0;
        boolean invalidTown = false;

        switch (town) {
            case "Sofia":
                if (sells > 10000) {
                    commissions = 0.12;
                } else if (sells > 1000) {
                    commissions = 0.08;
                } else if (sells > 500) {
                    commissions = 0.07;
                } else if (sells >= 0) {
                    commissions = 0.05;
                }
                break;
            case "Varna":
                if (sells > 10000) {
                    commissions = 0.13;
                } else if (sells > 1000) {
                    commissions = 0.10;
                } else if (sells > 500) {
                    commissions = 0.075;
                } else if (sells >= 0) {
                    commissions = 0.045;
                }
                break;
            case "Plovdiv":
                if (sells > 10000) {
                    commissions = 0.145;
                } else if (sells > 1000) {
                    commissions = 0.12;
                } else if (sells > 500) {
                    commissions = 0.08;
                } else if (sells >= 0) {
                    commissions = 0.055;
                }
                break;
            default:
                invalidTown = true;
                break;
        }
        double result = sells * commissions;

        if (!invalidTown && sells >= 0) {
            System.out.printf("%.2f", result);
        }
        else {
            System.out.println("error");
        }
    }
}