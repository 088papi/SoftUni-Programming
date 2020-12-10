import java.util.Scanner;

public class Ex08_GraduationPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double sumAllGrades = 0;
        int counter = 0;
        int excluded = 0;
        double grade = Double.parseDouble(scanner.nextLine());
        while (grade >= 0) {

            sumAllGrades += grade;
            excluded++;
            if (grade < 4) {

                counter++;
                if (counter > 1) {
                    System.out.printf("%s has been excluded at %d grade", name, excluded);
                }
            }
            if (excluded == 12) {
                System.out.printf("%s graduated. Average grade: %.2f", name, sumAllGrades / 12);
            }
            grade = Double.parseDouble(scanner.nextLine());


        }
    }
}
