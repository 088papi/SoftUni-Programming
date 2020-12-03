import java.util.Scanner;

public class Task5_DecryptingMessages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        String result = "";
        for (int i = 0; i < n; i++) {
            String c = scanner.nextLine();
            char letter = (char) (c.charAt(0) + key);
            result += letter;

        }

        System.out.println(result);
    }
}
