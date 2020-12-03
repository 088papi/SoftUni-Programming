import java.util.Scanner;
//100/100
public class Task06_EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        int sum = 0;

        String[] firstLine = s.split(" ");

        int[] numbersFirstLine = new int[firstLine.length];

        for (int i = 0; i < numbersFirstLine.length; i++) {
         numbersFirstLine[i] = Integer.parseInt(firstLine[i]);

        }

        String s2 = scanner.nextLine();

        String[] secondLine = s2.split(" ");
        int[] numbersSecondLine = new int[secondLine.length];

        for (int i = 0; i <numbersSecondLine.length ; i++) {
            numbersSecondLine[i] = Integer.parseInt(secondLine[i]);

            if (numbersFirstLine[i] == numbersSecondLine[i])  {
                sum += numbersFirstLine[i];

            } else if (numbersFirstLine[i] != numbersSecondLine[i]) {

                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                return;
            }

        }
        System.out.printf("Arrays are identical. Sum: %d", sum);


        }


        }


