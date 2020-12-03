import java.util.Scanner;

public class Task04_DecryptingMessages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n ; i++) {
            char letter = scanner.nextLine().charAt(0);

char sum = (char) (letter + key);
            System.out.println(sum);

        }
    }
}
