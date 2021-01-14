import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;

public class Task7_MathPotato {

    //submit
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] data = scanner.nextLine().split(" ");
        ArrayDeque<String> queue = new ArrayDeque<>();
        Collections.addAll(queue, data);

        int n = Integer.parseInt(scanner.nextLine());
        int cycle = 1;
        while (queue.size() > 1) {
            for (int i = 1; i < n; i++) {
                queue.offer(queue.poll());
            }
            if (isPrime(cycle)) {
                System.out.println("Prime " + queue.peek());
            } else {

                System.out.println("Removed " + queue.poll());
            }
            cycle++;


        }
        System.out.println("Last is " + queue.poll());
    }

    static boolean isPrime(int num) {


        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

}


