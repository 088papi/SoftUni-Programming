import java.util.Scanner;
//100/100
public class Task4_SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      int n = Integer.parseInt(scanner.nextLine());
int sum = 0;

        for (int i = 1; i <=n ; i++) {
            char character = scanner.nextLine().charAt(0);

sum+=character;



        }
        System.out.println("The sum equals: " + sum);
    }
}
