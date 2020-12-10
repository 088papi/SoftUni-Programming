import java.util.Scanner;
// РЕШЕНО - 100/100
public class Ex01_ReadText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// String input = scanner.nextLine();
        while (true) {

            // while (!input.equals("Stop")) {
            // sout (input)
            //  input = scanner.nextLine()  }
            String input = scanner.nextLine();
            if (input.equals("Stop")){
                break;
            }
            System.out.println(input);

        }
    }
}
