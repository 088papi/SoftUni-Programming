import java.util.Scanner;

public class Task7_RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int timesToBeMultiplied = Integer.parseInt(scanner.nextLine());
        System.out.println(repeatString(string,timesToBeMultiplied));
    }

    public static String repeatString(String s, int count) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < count; i++) {
            result.append(s);


        }
        return result.toString();
    }
}
