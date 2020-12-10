import java.util.Scanner;
// РЕШЕНО - 100/100
public class Lab06_Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int floorNumber = Integer.parseInt(scanner.nextLine());
        int apartmentCount = Integer.parseInt(scanner.nextLine());

        for (int i = floorNumber; i >= 1; i--) {
            for (int j = 0; j < apartmentCount; j++) {
                if (i == floorNumber) {
                    System.out.print("L" + i + j + " ");
                } else if (i % 2 == 0) {
                    System.out.print("O" + i + j + " ");
                } else {
                    System.out.print("A" + i + j + " ");
                }

            }
            System.out.println();
        }
    }
}
