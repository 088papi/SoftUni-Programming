import javax.swing.plaf.IconUIResource;
import java.util.Scanner;
// РЕШЕНО 100/100
public class Ex03_SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int sumPrime = 0;
        int sumNonPrime = 0;
//1.Step
        while (!input.equals("stop")) {
            int num = Integer.parseInt(input); // ==> за да превърнем стринга в число
            boolean isPrime = true;
//2.Step
            if (num < 0) {
                System.out.println("Number is negative.");
            } else {
                //3.Step
                for (int i = 2; i < num; i++) {
                    if (num %i == 0){ // числото не е просто
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    sumPrime += num;
                } else {
                    sumNonPrime += num;
                }
            }
            input = scanner.nextLine();
        System.out.println("Sum of all prime numbers is: " + sumPrime );
        System.out.println("Sum of all non prime numbers is: " + sumNonPrime );
    }
}
