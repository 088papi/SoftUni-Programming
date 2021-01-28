import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Task5Resolve_FilterByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, Integer> nameAndAge = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] nameAge = scanner.nextLine().split(", ");
            nameAndAge.put(nameAge[0], Integer.parseInt(nameAge[1]));
        }

        String condition = scanner.nextLine();
        int ageCondition = Integer.parseInt(scanner.nextLine());
        String format = scanner.nextLine();


        Predicate<Integer> tester = FilterAge(condition,ageCondition);
        Consumer<Map.Entry<String, Integer>> printer  = Printer(format);

        printStudents(nameAndAge, tester,printer);
    }

    private static void printStudents(LinkedHashMap<String, Integer> nameAndAge, Predicate<Integer> tester, Consumer<Map.Entry<String, Integer>> printer) {
        for (Map.Entry<String, Integer> student: nameAndAge.entrySet()) {
            if (tester.test(nameAndAge.get(student.getKey()))){
                printer.accept(student);
            }

        }
    }

    static Predicate<Integer> FilterAge(String condition, int age) {
        Predicate<Integer> tester = null;

        switch (condition) {
            case "younger":
                tester = e -> e <= age;
                break;
            case "older":
                tester = e -> e >= age;
                break;
        }
        return tester;
    }


    static Consumer<Map.Entry<String, Integer>> Printer(String format) {
        Consumer<Map.Entry<String ,Integer>> printer = null;

        switch (format){
            case "name age":
                printer = person -> System.out.printf("%s - %d%n",
                        person.getKey(), person.getValue());
                break;
            case "name":
               printer = person -> System.out.println(person.getKey());
                break;
            case "age":
               printer = person -> System.out.println(person.getValue());
                break;

        }

        return printer;
    }


}
