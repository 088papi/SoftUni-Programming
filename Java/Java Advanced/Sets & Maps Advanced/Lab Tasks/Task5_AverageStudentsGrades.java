import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class Task5_AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String,List<Double>> studentInfo = new TreeMap<>();
        for (int i = 0; i < n; i++) {

        String[] data = scanner.nextLine().split(" ");
        String name = data[0];
        double grade = Double.parseDouble(data[1]);

        if (studentInfo.containsKey(name)){
            studentInfo.get(name).add(grade);
        } else {
            List<Double> grades = new ArrayList<>();
            grades.add(grade);
            studentInfo.put(name,grades);
        }

        }

        studentInfo.entrySet().forEach((entry) -> {
                System.out.print(entry.getKey() + " -> ");
            entry.getValue().stream().forEach(aDouble -> {
                System.out.printf("%.2f ", aDouble);
            });

            AtomicReference<Double> sum = new AtomicReference<>((double) 0);
            entry.getValue().stream().forEach(aDouble -> {

                sum.updateAndGet(v -> (double) (v + aDouble));

            });
            double average = sum.get() / entry.getValue().size();
            System.out.printf("(avg: %.2f)", average);
            System.out.println();
        });

    }


}
