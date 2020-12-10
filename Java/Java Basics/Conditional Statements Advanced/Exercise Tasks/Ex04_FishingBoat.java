import java.util.Scanner;

// РЕШЕНА - 100/100

public class Ex04_FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int numberFishermen = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;

        switch (season) {
            case "Spring":
                totalPrice = 3000;
                break;
            case "Summer":
            case "Autumn":
                totalPrice = 4200;
                break;
            case "Winter":
                totalPrice = 2600;
                break;
        }

        if (numberFishermen <= 6) {
            totalPrice *= 0.9; // totalPrice  = totalPrice * 0.9 == totalPrice - (totalPrice * 0.1);
        } else if (numberFishermen >= 7 && numberFishermen <= 11) {
            totalPrice *= 0.85;
        } else {
            totalPrice *= 0.75;
        }
        if (numberFishermen % 2 == 0 && !season.equals("Autumn")) {
            totalPrice *= 0.95;
        }
        if (totalPrice <= budget) {
            System.out.printf("Yes! You have %.2f leva left.", Math.abs(totalPrice - budget));

        } else {
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(totalPrice - budget));
        }



    }
}
