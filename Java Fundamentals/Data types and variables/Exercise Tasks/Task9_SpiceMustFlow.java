import java.util.Scanner;
//100/100
public class Task9_SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int startingYield = Integer.parseInt(scanner.nextLine());

        int dayCounter = 0;
        int totalSpice = 0;
        int workersConsumption = 0;
        while (startingYield >= 100) {



            totalSpice += startingYield;
            if (totalSpice >= 26) {
                totalSpice -= 26;
            }
            startingYield -= 10;

            dayCounter++;
        }
        if (totalSpice >= 26) {
            totalSpice -= 26;
        }

        System.out.println(dayCounter);
        System.out.println(totalSpice);

    }
}
