import java.util.Arrays;
import java.util.Scanner;
// 100/100
public class maxSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int maxCount = 0;
        int currentMaxCount = 0;
        int sequenceNumber = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            int currentNum = numbers[i];
            int nextNum = numbers[i + 1] ;

            if (currentNum == nextNum) {
                currentMaxCount++;
            } else {
                currentMaxCount = 0;
            }

            if (currentMaxCount > maxCount) {
                maxCount = currentMaxCount;
                sequenceNumber = currentNum;
            }

        }

        for (int i = 0; i < maxCount + 1; i++) {
            System.out.print(sequenceNumber + " ");

        }
    }

}

