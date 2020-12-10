import java.util.Scanner;

public class Ex03_NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flower = scanner.nextLine();
        int numberFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;
        double leftMoney = 0;
        double neededMoney = 0;

        if (flower.equals("Roses")) {
            if (numberFlowers > 80) {
                totalPrice = numberFlowers * 5 - ((0.10 * (numberFlowers * 5)));
                leftMoney = budget - totalPrice;
                System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numberFlowers, flower, leftMoney);
            } else if (numberFlowers < 80) {
                totalPrice = numberFlowers * 5;
                if (budget > totalPrice) {
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numberFlowers, flower, totalPrice);
                } else if (budget < totalPrice) {
                    neededMoney = totalPrice - budget;
                    System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(neededMoney));
                }


            }
        }

        if (flower.equals("Dahlias")) {
            if (numberFlowers > 90) {
                totalPrice = numberFlowers * 3.80 - ((0.15 * (numberFlowers * 3.80)));
                leftMoney = budget - totalPrice;
                System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numberFlowers, flower, leftMoney);
            } else if (numberFlowers < 90) {
                totalPrice = numberFlowers * 3.80;
                if (budget > totalPrice) {
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numberFlowers, flower, totalPrice);
                } else if (budget < totalPrice) {
                    neededMoney = totalPrice - budget;
                    System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(neededMoney));
                } else if (budget < totalPrice) {
                    neededMoney = totalPrice - budget;
                    System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(neededMoney));
                }
            }
            if (flower.equals("Tulips")) {
                if (numberFlowers > 80) {
                    totalPrice = numberFlowers * 2.80 - ((0.15 * (numberFlowers * 2.80)));
                    leftMoney = budget - totalPrice;
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numberFlowers, flower, leftMoney);
                } else if (numberFlowers < 80) {
                    totalPrice = numberFlowers * 2.80;
                    if (budget > totalPrice) {
                        System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numberFlowers, flower, totalPrice);
                    } else if (budget < totalPrice) {
                        neededMoney = totalPrice - budget;
                        System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(neededMoney));
                    } else if (budget < totalPrice) {
                        neededMoney = totalPrice - budget;
                        System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(neededMoney));
                    }
                }
            }
        }
    }
}

