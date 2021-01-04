import java.util.Scanner;

public class TimePlus15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int afterFewMinutes = minutes + 15;
        int newMinutes = afterFewMinutes % 60;

        if (afterFewMinutes >= 60) {
            hour = hour + 1;
        }
        if (hour > 23) {
            hour = 0;
        }
        if (afterFewMinutes < 60) {
            System.out.printf("%d:%d", hour, afterFewMinutes);
        } else if (newMinutes < 10) {
            System.out.printf("%d:0%d", hour, newMinutes);
        } else {
            System.out.printf("%d:%d", hour, newMinutes);
        }
    }
}