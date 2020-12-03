import java.util.Scanner;
//  100 / 100
public class Task8_LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char letter = scanner.nextLine().charAt(0);

        if (Character.isUpperCase(letter)) {

            System.out.println("upper-case");
        } else {
            System.out.println("lower-case");
        }



    }
}
