import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Task1_FlowerWreaths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstInput = readArray(scanner);
        int[] secondInput = readArray(scanner);


        Deque<Integer> liliesStack = new ArrayDeque<>();
        for (int i : firstInput) {
            liliesStack.push(i);
        }

        Deque<Integer> rosesQueue = new ArrayDeque<>();
        for (int i : secondInput) {
            rosesQueue.offer(i);
        }

        int wreaths = 0;
        int forLater = 0;
        while (true) {
            if (rosesQueue.isEmpty()){
                break;
            }
            if (liliesStack.isEmpty()){
                break;
            }

            int rose = rosesQueue.peek();
            int lilly = liliesStack.peek();

            if (rose + lilly == 15) {
                wreaths += 1;
                rosesQueue.poll();
                liliesStack.pop();
            } else if (rose + lilly > 15) {
                lilly -= 2;
                liliesStack.pop();
                liliesStack.push(lilly);
            } else {
                forLater +=  (rose + lilly);
                rosesQueue.poll();
                liliesStack.pop();
            }
        }
        if (forLater >= 15) {
            wreaths += forLater / 15;
        }
        if (wreaths >= 5) {
            System.out.printf("You made it, you are going to the competition with %d wreaths!", wreaths);
        } else {
            System.out.printf("You didn't make it, you need %d wreaths more!", 5 - wreaths);
        }


    }


    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
