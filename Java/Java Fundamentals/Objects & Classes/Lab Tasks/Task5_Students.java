import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//100/100
public class Task5_Students {
    static class Student {

        String firstName;
        String lastName;
        String age;
        String homeTown;

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getAge() {
            return age;
        }

        public String getHomeTown() {
            return homeTown;
        }


        public Student(String firstName, String lastName, String age, String homeTown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.homeTown = homeTown;
        }


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        while (true){
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }

            String[] data = input.split(" ");
            String firstName = data[0];
            String lastName = data[1];
            String age = data[2];
            String homeTown = data[3];



            Student student = new Student(firstName,lastName,age,homeTown);

            students.add(student);

        }

        String command = scanner.nextLine();

        for (Student student: students) {
            if (student.getHomeTown().equals(command)) {
                System.out.printf("%s %s is %s years old%n", student.getFirstName(),student.getLastName(), student.getAge());
            }

        }



    }


}
