package hotel;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        //50.25 5 Summer VIP
        double pricePerDay = Double.parseDouble(input[0]);
        int daysCount = Integer.parseInt(input[1]);
        String season = input[2].toUpperCase();
        String discountType = input[3];
        if (!input[3].equals("SecondVisit")) {
            discountType = discountType.toUpperCase();
        } else {
            discountType = "SECOND_VISIT";
        }
        PriceCalculator calculator = new PriceCalculator(
                pricePerDay, daysCount, Season.valueOf(season),
                DiscountType.valueOf(discountType));

        System.out.printf("%.2f", calculator.getTotalPrice());

    }
}
