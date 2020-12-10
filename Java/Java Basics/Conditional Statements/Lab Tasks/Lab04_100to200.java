import java.util.Scanner;

public class Lab04_100to200 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        // под 100, между 100 и 200 или над 200
        //	Less than 100			Between 100 and 200		Greater than 200

        if (number<=100) {
            System.out.println("Less than 100");
        } else if (number >= 100 && number <= 200) {
            System.out.println("Between 100 and 200");
        } else System.out.println("Greater than 200");
    }
}
