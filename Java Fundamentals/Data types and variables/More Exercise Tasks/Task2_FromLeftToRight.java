import java.util.Scanner;

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
            leftSum = 0;
            rightSum = 0;
            while (leftNum != 0) {
                leftSum += leftNum % 10;
                leftNum /= 10;
            }
            while (rightNum != 0) {
                rightSum += rightNum % 10;
                rightNum /= 10;
            }

            System.out.println((Math.abs(Math.max(leftSum, rightSum))));
        }
    }
}
