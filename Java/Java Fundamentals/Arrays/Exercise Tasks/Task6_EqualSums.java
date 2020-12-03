øimport java.util.Arrays;
import java.util.Scanner;
// 100/100
public class Task6_EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
        .mapToInt(Integer::parseInt)
        .toArray();
boolean equals = false;
if (numbers.length < 1) {
    System.out.println(0);
    return;
}

        for (int i = 0; i < numbers.length; i++) {

            int leftSum = 0;
            int rightSum = 0;

            for (int j = i - 1 ; j >= 0 ; j--) {
                leftSum+= numbers[j];
            }
            for (int j = i+1; j < numbers.length ; j++) {
                rightSum += numbers[j];
            }

            if (leftSum==rightSum) {
                equals = true;
                System.out.println(i);
                break;
            }

        }
        if (!equals) {
            System.out.println("no");
        }

    }
}
