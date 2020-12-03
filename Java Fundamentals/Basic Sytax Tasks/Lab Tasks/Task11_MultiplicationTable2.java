import java.util.Scanner;
//100/100
public class Task11_MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int number = Integer.parseInt(scanner.nextLine());
        int multiplier = Integer.parseInt(scanner.nextLine());

        if (multiplier > 10) {
            System.out.println(number + " X " + multiplier + " = " + number * multiplier);
        } else {


            for (int i = multiplier; i <= 10; i++) {

                int result = number * i;
                System.out.println(number + " X " + i + " = " + result);
            }
        }
    }
}
