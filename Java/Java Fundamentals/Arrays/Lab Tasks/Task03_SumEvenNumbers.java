import java.util.Scanner;
//100/100
public class Task03_SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        int sum = 0;
       String[] numbersAsString = s.split(" ");

       int[] numbers = new int[numbersAsString.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(numbersAsString[i]);
     if (numbers[i] % 2 == 0) {
         sum += numbers[i];
     }
        }
        System.out.println(sum);

    }
}
