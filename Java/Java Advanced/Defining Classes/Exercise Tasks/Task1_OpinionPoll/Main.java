import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            String name = data[0];
            int age = Integer.parseInt(data[1]);
            Person person = new Person(name, age);
            people.add(person);

        }


        people.stream().filter(e -> e.getAge() > 30).sorted((a,b) -> {
            return a.getName().compareTo(b.getName());
        })
        .forEach(f -> System.out.printf("%s - %d%n", f.getName(), f.getAge()));



    }
}
