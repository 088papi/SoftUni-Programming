import java.util.Scanner;
// РЕШЕНО - 100/100
public class Ex02_Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = scanner.nextLine();
        String input = scanner.nextLine();

        while(!input.equals(password)) {
            input = scanner.nextLine();

        }
        System.out.printf("Welcome %s!", username);
    }
}
