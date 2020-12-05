import java.util.Arrays;
import java.util.Scanner;
//100/100
public class ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int shotTargetsCounter = 0;

        while (true) {
            String input = scanner.next();

            if (input.equals("End")) {
                break;
            }

            int givenIndex = Integer.parseInt(input);

            if (givenIndex >= arr.length) {
                continue;
            }

            int currentTarget = arr[givenIndex];

                if (currentTarget == -1) {
                    continue;
                }

                arr[givenIndex] = -1;
                shotTargetsCounter++;

            for (int i = 0; i < arr.length; i++) {


                if (arr[i] > currentTarget && arr[i] != -1) {
                    arr[i] = arr[i] - currentTarget;
                } else if (arr[i] <= currentTarget && arr[i] != -1) {
                    arr[i] = arr[i] + currentTarget;
                }
            }


        }

        System.out.printf("Shot targets: %d -> ", shotTargetsCounter);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
