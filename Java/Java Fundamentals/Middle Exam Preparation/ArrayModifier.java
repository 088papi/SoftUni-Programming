import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        while (true) {

            String command = scanner.nextLine();

            if (command.equals("end")) {
                break;
            }

            if (command.equals("decrease")) {
                for (int i = 0; i < arr.length ; i++) {
                    arr[i] -= 1;
                }
            }



            if (command.startsWith("swap")) {

                SwapElementsInArray(arr, command);
            }
            if (command.startsWith("multiply")) {
                String[] list = command.split(" ");
                int index1 = Integer.parseInt(list[1]);
                int index2 = Integer.parseInt(list[2]);
                int result = arr[index1] * arr[index2];
                arr[index1] = result;
            }

        }

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]);
            if (i < arr.length-1) {
                System.out.print(", ");
            }
        }

    }

    private static void SwapElementsInArray(int[] arr, String command) {
        String[] list = command.split(" ");
        int index1 = Integer.parseInt(list[1]);
        int index2 = Integer.parseInt(list[2]);

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
