import java.util.Scanner;
// РЕШЕНА - 100/100 
public class Ex09_LeftRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            leftSum += num;
        }
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            rightSum += num;
        }
        if (leftSum == rightSum) {
            System.out.printf("Yes, sum = %d", leftSum);

        } else {
            int diff = Math.abs(rightSum - leftSum);
            System.out.printf("No, diff = %d", diff);
        }
    }
}