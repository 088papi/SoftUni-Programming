
import java.util.Scanner;
//100/100
public class Task2_SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

String num = scanner.nextLine();
int sum = 0;
        for (int i = 0; i < num.length() ; i++) {
int currentNum = (int) num.charAt(i) - 48;

sum += currentNum;

        }

        System.out.println(sum);

    }
}
