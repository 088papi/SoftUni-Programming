import java.util.Scanner;
//100/100
public class Task2_FromLeftToRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        long leftSum = 0;
        long rightSum = 0;
        for (int i = 0; i < n; i++) {
            String[] numbers = scanner.nextLine().split(" ");
            long leftNum = Long.parseLong(numbers[0]);
            long rightNum = Long.parseLong(numbers[1]);
             long sum = 0;
             
            if (leftNum < rightNum) {
                sum = 0;
                while (rightNum != 0) {
                    sum += rightNum % 10;
                    rightNum /= 10;

                }
                System.out.println(Math.abs(sum));
            } else {
                sum = 0;
                while (leftNum != 0) {
                    sum += leftNum % 10;
                    leftNum /= 10;

                }
                System.out.println(Math.abs(sum));
            }

        }
    }
}
