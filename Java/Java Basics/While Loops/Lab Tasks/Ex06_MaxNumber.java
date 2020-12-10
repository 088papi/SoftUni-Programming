import java.util.Scanner;
//РЕШЕНО - 100/100
public class Ex06_MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int max = Integer.MIN_VALUE;

        while (!input.equals("Stop")) {
           int current = Integer.parseInt(input);
            if (current >= max) {
                max = current;

            }
input = scanner.nextLine();
        } System.out.println(max);
    }
}
