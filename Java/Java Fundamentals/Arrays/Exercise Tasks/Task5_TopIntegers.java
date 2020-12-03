import java.util.Arrays;
import java.util.Scanner;
// 100/100
public class Task5_TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i <numbers.length ; i++) {
           boolean isTopInteger = true;
            int currentElement = numbers[i];
            for (int j = i + 1; j < numbers.length ; j++) {
                if (currentElement <= numbers[j]) {
                    isTopInteger = false;
                }
            }
            if (isTopInteger) {
                System.out.print(currentElement + " ");
            }
        }


    }
}
