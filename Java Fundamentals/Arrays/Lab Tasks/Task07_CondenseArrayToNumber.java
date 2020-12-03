import java.util.Arrays;
import java.util.Scanner;

public class Task07_CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String arr = scanner.nextLine();
        String[] arrayAsString = arr.split(" ");
        int[] numbers = new int[arrayAsString.length];
int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(arrayAsString[i]);
                }
        for (int j = 0; j < numbers.length - 1 ; j++) {

                int[] condensed = new int[numbers.length];
                condensed[j] = numbers[j] + numbers[j+ 1];
                numbers[j] = condensed[j];
           sum += j;

            }

        System.out.println((sum));
            }


        }



