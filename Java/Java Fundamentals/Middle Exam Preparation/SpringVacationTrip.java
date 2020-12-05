import java.util.Scanner;
// 100/100
public class SpringVacationTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tripDays = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        int groupOfPeople = Integer.parseInt(scanner.nextLine());
        double priceForFuelPerKm = Double.parseDouble(scanner.nextLine());
        double dailyFoodPerPersonPrice = Double.parseDouble(scanner.nextLine());
        double dailyRoomPerPersonPrice = Double.parseDouble(scanner.nextLine());
        double totalDistanceExpenses = 0;

        double totalFoodExpenses = tripDays * groupOfPeople * dailyFoodPerPersonPrice;

        double totalHotelExpenses = tripDays * groupOfPeople * dailyRoomPerPersonPrice;

        if (groupOfPeople > 10) {
            totalHotelExpenses -= (0.25 * totalHotelExpenses);
        }
        double currentExpenses = totalHotelExpenses + totalFoodExpenses;
        int dayCounter = 1;


        for (int i = 1; i <= tripDays; i++) {
            double travelledDistanceInKm = Double.parseDouble(scanner.nextLine());


            totalDistanceExpenses = travelledDistanceInKm * priceForFuelPerKm;

            currentExpenses += totalDistanceExpenses;

            if (dayCounter % 3 == 0 || dayCounter % 5 == 0) {
                currentExpenses += currentExpenses * 0.4;
            }
            if (dayCounter % 7 == 0) {
                double moneyToReceive = currentExpenses / groupOfPeople;
                currentExpenses -= moneyToReceive;
            }
            if (currentExpenses> budget){
                System.out.print("Not enough money to continue the trip. ");
                break;
            }

            dayCounter++;
        }
        if (budget >= currentExpenses) {
            double moneyLeft = budget - currentExpenses;
            System.out.printf("You have reached the destination. You have %.2f$ budget left.", moneyLeft);
        } else {

            double neededMoney = currentExpenses - budget;
            System.out.printf("You need %.2f$ more.", Math.abs(neededMoney));
        }
    }
}
