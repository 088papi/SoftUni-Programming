import java.util.Scanner;
// 100 / 100
public class Task5_ConcatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

String firstName = scanner.nextLine();
String secondName = scanner.nextLine();
String delimiter = scanner.nextLine();


        System.out.printf("%s%s%s", firstName,delimiter,secondName);

    }
}
