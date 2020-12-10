import java.util.Scanner;
// РЕШЕНО - 100/100 - 
public class Ex2_HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int maxNum = Integer.MIN_VALUE;


        for (int i = 1; i <= n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            sum = sum + currentNum;
            if (currentNum > maxNum) {
                maxNum = currentNum;
            }
        }

        int sumWithoutMax = sum - maxNum;

        if (maxNum == sumWithoutMax) {
            System.out.printf("Yes%nSum = %d", maxNum);
        } else {
            int diff = Math.abs(maxNum - sumWithoutMax);
            System.out.printf("No%nDiff = %d", diff);

        }

    }
}
