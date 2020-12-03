bimport java.util.Arrays;
import java.util.Scanner;
// 100/100
public class magicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int givenNum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numbers.length-1 ; i++) {
            int currentNum = numbers[i];

            for (int j = i + 1; j < numbers.length; j++) {
                int secondNum = numbers[j];
                if (currentNum + secondNum == givenNum )  {
                    System.out.println(currentNum + " " + secondNum);
                }

            }

        }


    }
}
