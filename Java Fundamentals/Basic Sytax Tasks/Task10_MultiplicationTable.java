import java.util.Scanner;

public class Task10_MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        for (int i = 1; i <= 10 ; i++) {
int result = number  * i;
            System.out.println(number + " X " + i + " = " + result);

        }
    }
}
