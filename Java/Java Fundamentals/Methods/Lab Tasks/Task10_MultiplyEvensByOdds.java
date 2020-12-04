import java.text.DecimalFormat;
import java.util.Scanner;

public class Task10_MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                int num = Math.abs(Integer.parseInt(scanner.nextLine()));
                System.out.println(getMultipleOfEvensAndOdds(num));
            }

            private static int getMultipleOfEvensAndOdds(int num) {

                return GetSumOfEvenDigits(num) * GetSumOfOddDigits(num);

            }

            private static int GetSumOfOddDigits(int num) {

                int currDigit = 0;
                int sum = 0;
                while (num > 0)
                {
                    currDigit = num % 10;

                    if (currDigit % 2 != 0)
                        sum = sum + currDigit;

                    num = num / 10;
                }
                return sum;

            }

            private static int GetSumOfEvenDigits(int num) {

                int currDigit = 0;
                int sum = 0;
                while (num > 0)
                {
                    currDigit = num % 10;

                    if (currDigit % 2 == 0)
                        sum = sum + currDigit;

                    num = num / 10;
                }
                return sum;
            }

        }


