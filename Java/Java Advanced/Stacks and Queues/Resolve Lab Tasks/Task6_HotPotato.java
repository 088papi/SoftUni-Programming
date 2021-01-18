import java.util.ArrayDeque;
import java.util.Scanner;

public class Task6_HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputNames = scanner.nextLine().split("\\s+");
        ArrayDeque<String> queue = new ArrayDeque<>();
        int toss = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < inputNames.length; i++) {
            queue.offer(inputNames[i]);
        }

        while (queue.size() > 1) {

            for (int i = 1; i < toss; i++) {
                queue.offer(queue.poll());
            }
            System.out.println("Removed " + queue.poll());
            
        }


        System.out.println("Last is " + queue.poll());

    }
}
