import java.util.Scanner;
// РЕШЕНО
public class Ex02_EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNum = Integer.parseInt(scanner.nextLine());
        int endNum = Integer.parseInt(scanner.nextLine());

        for (int i = startNum; i <= endNum; i++) {

            int oddSum = 0;
            int evenSum = 0;

            String currentNum = "" + i;  //Integer.toString(int) --> прави int в стринг
            for (int j = 0; j < 6; j++) {
                // char currentChar = currentNum.charAt(j);
                int currentNumAtPosition = Integer.parseInt("" + currentNum.charAt(j));
                if (j % 2 == 0) {
                    evenSum += currentNumAtPosition; // четна


                } else {
                    oddSum += currentNumAtPosition; // нечетна
                }


            }
            if (evenSum == oddSum) {
                System.out.print(i + " ");
            }
        }


    }
}
