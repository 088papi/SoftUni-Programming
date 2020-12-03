import java.util.Scanner;
//100/100
public class Task05_EvenOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        String[] numbersAsStrings = s.split(" ");
        int[] numbers = new int[numbersAsStrings.length];

        int oddSum = 0;
        int evenSum = 0;


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(numbersAsStrings[i]);

            if (numbers[i] % 2 == 0) {
                evenSum += numbers[i];
            } else {
                oddSum += numbers[i];
            }
        }
        int sum = evenSum - oddSum;
        System.out.println(sum);
    }
}
