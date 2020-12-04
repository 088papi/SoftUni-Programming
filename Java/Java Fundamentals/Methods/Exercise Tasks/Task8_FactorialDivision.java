import java.util.Scanner;
// 100/100??
public class Task8_FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

int firstNum = Integer.parseInt(scanner.nextLine());
int secondNum = Integer.parseInt(scanner.nextLine());

double result = factorial(firstNum) * 1.0 / factorial(secondNum);
        System.out.printf("%.2f", result);
    }

    public static long factorial (long n) {
        long factorial = 1;
        for (int i = 1; i <= n ; i++) {
            factorial *= i;
        }
        return factorial;
    }


}
