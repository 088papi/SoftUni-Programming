import java.util.Scanner;
// 100/100
public class EasterCozonacs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double price1kgFlour = Double.parseDouble(scanner.nextLine());

        double price1PackEggs = 0.75 * price1kgFlour;
        double price1LMilk = price1kgFlour + 0.25 * price1kgFlour;
        double milkFor1CozonacPrice = price1LMilk * 0.25;
        double oneCozonacPrice = price1kgFlour + price1PackEggs + milkFor1CozonacPrice;
        int cozonacsMadeCounter = 0;
        int coloredEggs = 0;


        while (budget >= oneCozonacPrice) {

            budget-=oneCozonacPrice;
            cozonacsMadeCounter++;
            coloredEggs+=3;

            if (cozonacsMadeCounter % 3 == 0) {
                coloredEggs -= cozonacsMadeCounter - 2;
            }

        }

        System.out.printf("You made %d cozonacs! Now you have %d eggs and %.2fBGN left.", cozonacsMadeCounter, coloredEggs, budget);






    }
}
