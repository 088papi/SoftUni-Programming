import java.util.ArrayDeque;
import java.util.Scanner;

public class Task3_DecimalToBinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int decimalNumber = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> binaryNumber = new ArrayDeque<>();

        if (decimalNumber == 0) {
            System.out.println("0");
        } else {
            while (decimalNumber > 0) {

                if (decimalNumber % 2 == 0) {
                    binaryNumber.push(0);
                } else {
                    binaryNumber.push(1);
                }

                decimalNumber /= 2;

            }
        }

        while (!binaryNumber.isEmpty()){
            System.out.print(binaryNumber.pop());
        }
    }
}
