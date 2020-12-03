import java.util.Scanner;
// провери 100/100
public class Task3_ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        int[] firstArray = new int[lines];
        int[] secondArray = new int[lines];

        for (int i = 1; i <= lines; i++) {
            String[] line = scanner.nextLine().split(" ");

           if (i % 2 == 0) {
               firstArray[i-1] = Integer.parseInt(line[1]);
               secondArray[i-1] = Integer.parseInt(line[0]);
            } else {
               firstArray[i-1] = Integer.parseInt(line[0]);
               secondArray[i-1] = Integer.parseInt(line[1]);
           }

        }
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[i] + " ");

        }
        System.out.println();
        for (int i = 0; i < secondArray.length; i++) {
            System.out.print(secondArray[i] + " ");
        }
    }
}
