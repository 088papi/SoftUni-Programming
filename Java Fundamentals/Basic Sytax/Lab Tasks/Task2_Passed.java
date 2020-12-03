import java.util.Scanner;
//100/100
public class Task2_Passed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        if (grade>=3) {
            System.out.printf("Passed!");
        }
    }
}
