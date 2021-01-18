import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class Task7_MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = scanner.nextLine().split("\\s+");
        ArrayDeque<String> queue = new ArrayDeque<>();
        Collections.addAll(queue, names);

        int toss = Integer.parseInt(scanner.nextLine());
        int cycleCounter = 1;

        while (queue.size() > 1) {

            for (int i = 1; i <toss ; i++) {
                queue.offer(queue.poll());
            }

            if (isPrime(cycleCounter)){
                System.out.println("Prime " + queue.peek());
            } else {
                System.out.println("Removed " + queue.poll());
            }

            cycleCounter++;
        }
        System.out.println("Last is " + queue.peek());
    }

    private static boolean isPrime(int cycleCounter) {

        if (cycleCounter <=1){
            return false;
        }

        for (int i = 2; i <= Math.sqrt(cycleCounter); i++) {
            if (cycleCounter % i == 0) {
                return false;
            }
        }
    return true;
    }
}