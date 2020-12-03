import java.util.Scanner;
//100/100
public class Task12_RefractorSpecialNumbers {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int prime = 0;
        boolean isPrime = false;

        for (int i = 1; i <= n; i++) {

            prime = i;
            while (i > 0) {
                sum += i % 10;
                i = i / 10;
            }
            if (isPrime = (sum == 5) || (sum == 7) || (sum == 11)) {

                System.out.printf("%d -> True %n", prime);
            } else {
                System.out.printf("%d -> False%n", prime);
            }
            sum = 0;
            i = prime;
        }

    }
}