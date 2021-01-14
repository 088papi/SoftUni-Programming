import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Task2_BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numsInput = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int n = numsInput[0]; //to push
        int s = numsInput[1]; //to pop
        int x = numsInput[2]; //to check if is contained


        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < n; i++) {
            stack.push(numbers[i]);
        }

        for (int i = 0; i < s ; i++) {
            if (!stack.isEmpty()){
                stack.pop();
            }
        }
            if (stack.isEmpty()){
                System.out.println("0");
                return;
            }
        if (stack.contains(x)){
            System.out.println("true");
        } else {
            System.out.println(Collections.min((stack))); 
        }

    }
}
