import java.util.Scanner;
// 100/100
public class NationalCourt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int employee1Efficiency = Integer.parseInt(scanner.nextLine());
        int employee2Efficiency = Integer.parseInt(scanner.nextLine());
        int employee3Efficiency = Integer.parseInt(scanner.nextLine());
        int totalPeople = Integer.parseInt(scanner.nextLine());

        int totalEmployeeEfficiency = employee1Efficiency + employee2Efficiency + employee3Efficiency;

        int hourCounter = 0;

        while (totalPeople > 0) {
            hourCounter++;
            if (hourCounter % 4 == 0) {
            continue;
            }

            totalPeople -= totalEmployeeEfficiency;



        }

        System.out.printf("Time needed: %dh.", hourCounter);


    }
}
