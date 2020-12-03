import java.util.Scanner;
//100/100
public class Task10_SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n ; i++) {

            int sumOfDigits = 0;

            while (i > 0) {

                sumOfDigits+= i % 10;
                // по този начин намиране последната цифра от числото
                i /= 10;

            }
if (sumOfDigits == 5 || sumOfDigits == 7 || sumOfDigits == 11 ) {

}
        }

        }

}




