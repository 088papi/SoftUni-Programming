import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Task5_ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int n = Integer.parseInt(scanner.nextLine());
        list.removeIf(e -> e % n == 0);

        Collections.reverse(list);
        Consumer<List<Integer>> printer = e -> e.forEach(a -> {
            System.out.print(a + " ");

        });
        printer.accept(list);


    }

}
