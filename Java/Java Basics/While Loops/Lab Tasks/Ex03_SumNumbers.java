import java.util.Scanner;
// РЕШЕНО - 100/100
public class Ex03_SumNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
// ДРУГ ПОДХОД

        // while (sum <= number) {
        // int currentNumber = Integer.parseInt(scanner.nextLine());
        //sum = sum + currentNumber;
        // }
        // System.out.println(sum);


        while (true) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            sum = sum + currentNumber;
            if (sum >= number) {
                break;
            }
        }
        System.out.println(sum);
    }
}