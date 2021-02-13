import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task1_Scheduling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> tasksStack = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt).forEach(tasksStack::push);

        ArrayDeque<Integer> threadsQueue = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));


        int taskToKill = Integer.parseInt(scanner.nextLine());

        int killerThread = 0;

        while (true) {

            int currentTask = tasksStack.peek();
            int currentThread = threadsQueue.peek();

            if (currentTask == taskToKill) {
                killerThread = currentThread;
                break;
            } else if (currentThread >= currentTask) {
                tasksStack.pop();
                threadsQueue.poll();
            } else if (currentThread < currentTask) {
                threadsQueue.poll();
            }


        }
        System.out.printf("Thread with value %d killed task %d%n", killerThread, taskToKill);
        threadsQueue.forEach(a -> System.out.print(a + " "));

    }
}
