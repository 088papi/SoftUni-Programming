import java.util.Scanner;
//100/100;
public class Task4_PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = startNumber; i <= endNumber; i++) {
            sum += i;
            System.out.print(i + " ");
            if (i == endNumber) {
                System.out.println();
            }
        }
        System.out.println("Sum: " + sum);
    }
}
