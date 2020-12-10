import java.util.Scanner;
// 100 / 100
public class Ex04_TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int juryCount = Integer.parseInt(scanner.nextLine());
        String presentation = scanner.nextLine();

        double sumAllGrades = 0;
        int countPresentations = 0;

        while (!presentation.equals("Finish")) {
            double sumGrades = 0;
            countPresentations++;
            for (int i = 0; i < juryCount; i++) {
                double currentGrade = Double.parseDouble(scanner.nextLine());
                sumGrades += currentGrade;
            }

            double averageGrade = sumGrades / juryCount;
            System.out.printf("%s - %.2f.%n", presentation, averageGrade);

            sumAllGrades += averageGrade;



            presentation = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", sumAllGrades/countPresentations);

    }
}
