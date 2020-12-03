import java.util.Scanner;
//100/100
public class Task5_Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";
        int counter = 0;

        for (int i = username.length() - 1; i >= 0; i--) {

            password += username.charAt(i);
        }

        while (counter < 4) {
            String input = scanner.nextLine();
            if (input.equals(password)) {
                System.out.printf("User %s logged in.", username);
                return;
            } else if (counter < 3) {
                System.out.println("Incorrect password. Try again.");
            }
            counter++;
        }
        if (counter == 4) {
            System.out.printf("User %s blocked!", username);
        }
    }


}


