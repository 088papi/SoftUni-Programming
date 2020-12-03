import java.util.Scanner;
//100/100
public class Task9_SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sumOddNumbers = 0;

        for (int i = 0; i < n; i++) {


            int number = i * 2 + 1;
            System.out.println(number);

            sumOddNumbers += number;


        }
        System.out.println("Sum: " + sumOddNumbers);
    }
}
