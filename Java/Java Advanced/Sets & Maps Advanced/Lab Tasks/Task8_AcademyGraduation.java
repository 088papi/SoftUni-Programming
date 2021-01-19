import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;

public class Task8_AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, double[]> students = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();

            double[] grades = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToDouble(Double::parseDouble)
                    .toArray();
            double[] averageGrades = new double[1];


            for (int j = 0; true; ) {
                for (double grade : grades) {
                    averageGrades[j] += grade;
                }
                averageGrades[j] /= grades.length;
                break;
            }

            students.put(name, averageGrades);
        }

        students.forEach((key, value)
                -> {
            System.out.printf("%s is graduated with ", key);
            for (double v : value) {
                System.out.println(v);
            }
        });
    }
}
