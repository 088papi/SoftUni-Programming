import java.util.Scanner;
// 100/100
public class DisneyLandJourney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double cost = Double.parseDouble(scanner.nextLine());
        int numberOfMonthsToCollectMoney = Integer.parseInt(scanner.nextLine());
        double savedMoney = 0;
        int monthCounter = 0;
        for (int i = 1; i <= numberOfMonthsToCollectMoney; i++) {
            monthCounter++;


            if (monthCounter % 4 == 0) {
                savedMoney += 0.25 * savedMoney;
            }
            if (i != 1 && i % 2 != 0) {
                savedMoney -= 0.16 * savedMoney;
            }


            savedMoney += 0.25 * cost;
        }
        double moneyForSouvenirs = savedMoney - cost;

        if (savedMoney >= cost) {
            System.out.printf("Bravo! You can go to Disneyland and you will have %.2flv. for souvenirs.", moneyForSouvenirs);
        } else {
        double neededMoney = cost-savedMoney;
            System.out.printf("Sorry. You need %.2flv. more.", Math.abs(neededMoney));
        }
    }
}
