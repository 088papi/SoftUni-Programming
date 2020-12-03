import java.util.Scanner;
//100/100
public class Task3_Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());
int courses = people/ capacity;

        if (people <= capacity) {
            System.out.println("1");
        } else if (people % capacity == 0) {
            System.out.println(courses);
        } else {
            courses+=1;
            System.out.println(courses);
        }
    }
}
