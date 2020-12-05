import java.util.Scanner;
//100/100
public class BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            int studentsCount = Integer.parseInt(scanner.nextLine());
            int lecturesCount = Integer.parseInt(scanner.nextLine());
            int additionalBonus = Integer.parseInt(scanner.nextLine());

            double maxBonusPoints = 0;
            int maxAttendance = 0;

        for (int i = 0; i < studentsCount ; i++) {

            int studentAttendances = Integer.parseInt(scanner.nextLine());
            double totalBonus = 1.00 * studentAttendances / lecturesCount * (5 + (additionalBonus));


            if (totalBonus > maxBonusPoints) {
                maxBonusPoints = totalBonus;
                maxAttendance = studentAttendances;
            }

        }
        System.out.printf("Max Bonus: %.0f.%n", maxBonusPoints);
        System.out.printf("The student has attended %d lectures.", maxAttendance);

    }
}
