import java.util.Scanner;
// РЕШЕНО 100/100 
public class Ex05_DivideWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;

        for (int i = 0; i < n; i++) {
            int currentNumber =Integer.parseInt(scanner.nextLine());
            if (currentNumber % 2 == 0) {
                p1++;
            }
            if (currentNumber % 3 == 0) {
                p2++;
            }
            if (currentNumber % 4 == 0) {
                p3++;
            }

        }
        System.out.printf("%.2f%%%n", p1 * 1.0/n * 100);
        System.out.printf("%.2f%%%n", p2 * 1.0/n * 100);
        System.out.printf("%.2f%%%n", p3 * 1.0/n * 100);
    }

}


