import java.util.Scanner;

public class Ex03_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededMoney = Double.parseDouble(scanner.nextLine());
        double ownedMoney = Double.parseDouble(scanner.nextLine());
        int countDays = 0;
        int spendingCounter = 0;

        while (ownedMoney < neededMoney && spendingCounter < 5) {
            String command = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());
            countDays++;

            if (command.equals("save")) {
                ownedMoney = ownedMoney + money;
                spendingCounter = 0;
            }
            if (command.equals("spend")) {
                ownedMoney = ownedMoney - money;
                spendingCounter++;
                if (ownedMoney < 0) {
                    ownedMoney = 0;
                }
            }

        } if (spendingCounter == 5) {
            System.out.println("You can't save the money.");
            System.out.printf("%d", countDays);
        } if (ownedMoney >= neededMoney) {
            System.out.printf("You saved the money for %d days.", countDays);
        }
    }
}
