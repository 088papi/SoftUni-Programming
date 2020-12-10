import java.util.Scanner;

public class Ex06_GodzillaKingKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double priceCostumes = Double.parseDouble(scanner.nextLine());
        double decor = 0.1 * budget;
double priceCostumes2 = statists * priceCostumes;

            if (statists > 150) {
                priceCostumes2 = priceCostumes2 - (priceCostumes2 * 0.10);}
        if (decor + priceCostumes2 > budget) {
                double lessMoney = budget - (decor + priceCostumes);
                double allMoney = decor + priceCostumes2;
                double finSum = allMoney - budget;
                        System.out.println("Not enough money!");
                System.out.printf("Wingard needs %.2f leva more.", Math.abs(finSum));
            }

        else if (decor + priceCostumes2 <= budget) {
            if (statists > 150) {
                priceCostumes2 = priceCostumes2 - (priceCostumes2 * 0.10);
            }
            double moreMoney = budget - (decor + priceCostumes2);
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", moreMoney);
        }

        }
    }

