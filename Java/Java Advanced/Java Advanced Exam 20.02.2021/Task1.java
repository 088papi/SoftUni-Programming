import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> firstBoxQueue = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque <Integer> secondBoxStack = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(secondBoxStack::push);

        int totalSum = 0;

        while (true){
            if (firstBoxQueue.isEmpty()){
                System.out.println("First magic box is empty.");
            break;
            } else if (secondBoxStack.isEmpty()){
                System.out.println("Second magic box is empty.");
                break;
            }

            int sum = firstBoxQueue.peek() + secondBoxStack.peek();

            if (sum % 2 == 0){
                totalSum+=sum;
                secondBoxStack.pop();
                firstBoxQueue.poll();
            } else {
                firstBoxQueue.offer(secondBoxStack.poll());
            }

        }

        if (totalSum >= 90){
            System.out.printf("Wow, your prey was epic! Value: %d%n", totalSum);
        } else {
            System.out.printf("Poor prey... Value: %d%n", totalSum);
        }


    }
}
