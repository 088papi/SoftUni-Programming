import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task7_OrderByAge {
//100/100
    public static class Person {

        String name;
        String ID;
        int age;

        public Person(String name, String ID, int age) {
            this.name = name;
            this.ID = ID;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getID() {
            return ID;
        }

        public void setID(String ID) {
            this.ID = ID;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }


        public String print() {

            return String.format("%s with ID: %s is %d years old.", getName(), getID(), getAge());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> allPeople = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("End")) {
                break;
            }

            String[] data = input.split(" ");
            String name = data[0];
            String ID = data[1];
            int age = Integer.parseInt(data[2]);

            Person person = new Person(name, ID, age);
            allPeople.add(person);

        }

        allPeople.stream()
                .sorted((p1, p2) -> Integer.compare(p1.getAge(),p2.getAge()))
                .forEach(person -> System.out.println(person.print()));
    }
}