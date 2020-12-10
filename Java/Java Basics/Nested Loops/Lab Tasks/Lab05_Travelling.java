import java.util.Scanner;
 //  100 / 100

public class Lab05_Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
        double budget = 0;

        double allMoney = 0;
        boolean isValid = false;

        while (!country.equals("End")) {
            double minimalBudget = Double.parseDouble(scanner.nextLine());
            allMoney = 0;
            for (int i = 0; i < minimalBudget; i++) {

                double money = Double.parseDouble(scanner.nextLine());

                allMoney += money;

                if (allMoney >= minimalBudget) {
                    isValid = true;

                    break;
                }

            }
            if (isValid) {
                System.out.printf("Going to %s!%n", country);

                country = scanner.nextLine();
            }

        }

    }
}

                System.out.printf("Going to %s!%n", country);

                country = scanner.nextLine();
            }

        }

    }
}
