import java.util.ArrayDeque;
import java.util.Scanner;

public class Task3_DecimalToBinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayDeque<Integer> binary = new ArrayDeque<>();

        int decimal = Integer.parseInt(scanner.nextLine());

        if (decimal == 0){
            System.out.println(0);
            return;
        } else {
            while (decimal != 0){
                if (decimal % 2 == 0){
                    binary.push(0);
                } else {
                    binary.push(1);
                }

                decimal /=2;
            }

            for (int number:binary) {
                System.out.print(number);
            }


        }





    }

}
