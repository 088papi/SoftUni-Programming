import java.util.Scanner;

public class Ex07_SwimmingWorldRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double worldRecord = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeForOneMeter = Double.parseDouble(scanner.nextLine());

        double timeIvanNeeded = distance * timeForOneMeter;
        double resistance = Math.floor(distance / 15.0) * 12.5;
        double totalTime = timeIvanNeeded + resistance;

        if (totalTime < worldRecord) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", Math.abs(totalTime - worldRecord));
        }

    }
}