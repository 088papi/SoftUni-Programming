import java.util.Scanner;
// РЕШЕНО - СЪБМИТ В ДЖЪДЖ
public class Ex03_OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());

        double OddSum = 0;
        double OddMin = 1000000000.0;
        double OddMax = -1000000000.0;

        double EvenSum = 0;
        double EvenMin = 1000000000.0;
        double EvenMax = -1000000000.0;

        int counter = 0;


        for (int i = 0; i < number; i++) {
            double currentNum = Double.parseDouble(scanner.nextLine());

            counter++;

            if (counter % 2 != 0) {
                OddSum += currentNum;

                if (currentNum > OddMax) {
                    OddMax = currentNum;

                }
                if (currentNum < OddMin) {
                    OddMin = currentNum;
                }
            }

            if (counter % 2 == 0) {
                EvenSum += currentNum;

                if (currentNum > EvenMax) {
                    EvenMax = currentNum;


                }
                if (currentNum < EvenMin) {
                    EvenMin = currentNum;
                }


            }

        }

        System.out.printf("OddSum=%.2f,%n", OddSum);

        if (OddMin == 1000000000.00) {
            System.out.println("OddMin=No,");
        } else {
            System.out.printf("OddMin=%.2f,%n", OddMin);
        }

        if (OddMax == -1000000000.00) {
            System.out.println("OddMax=No,");
        } else {
            System.out.printf("OddMax=%.2f,%n", OddMax);
        }

        System.out.printf("EvenSum=%.2f,%n", EvenSum);
        if (EvenMin == 1000000000.00) {
            System.out.println("EvenMin=No,");
        } else {
            System.out.printf("EvenMin=%.2f,%n", EvenMin);
        }
        if (EvenMax == -1000000000.00) {
            System.out.println("EvenMax=No");
        } else {

            System.out.printf("EvenMax=%.2f%n", EvenMax);
        }


    }
}
