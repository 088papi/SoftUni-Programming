import java.util.Scanner;

public class SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstEmployeeEfficiency = Integer.parseInt(scanner.nextLine());
        int secondEmployeeEfficiency = Integer.parseInt(scanner.nextLine());
        int thirdEmployeeEfficiency = Integer.parseInt(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        int hourCounter = 0;

        int sum = firstEmployeeEfficiency + secondEmployeeEfficiency + thirdEmployeeEfficiency;
        while (studentsCount > 0) {

            hourCounter++;
            if (hourCounter %4 == 0) {
                continue;
            }
            studentsCount-=sum;

        }

        System.out.printf("Time needed: %dh.", hourCounter);
    }
}
