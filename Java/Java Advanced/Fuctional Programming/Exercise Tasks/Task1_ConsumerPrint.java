import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class Task1_ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        Consumer<String[]> printer = a -> Arrays.stream(a).forEach(System.out::println);
        printer.accept(input);
    }
}
