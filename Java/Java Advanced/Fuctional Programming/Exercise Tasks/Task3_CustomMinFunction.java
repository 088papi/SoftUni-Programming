import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class Task3_CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        Function<int[], Integer> findSmallestNum =
                integers -> Arrays.stream(integers).min().orElse(0);

        System.out.println(findSmallestNum.apply(input));


    }
}
