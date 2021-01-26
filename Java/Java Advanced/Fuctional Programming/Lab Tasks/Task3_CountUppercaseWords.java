import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Task3_CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Predicate<String> startsWithUpperCase = str -> str != null
                && !str.isEmpty()
                && Character.isUpperCase(str.charAt(0));



        List<String> collect = Arrays.stream(scanner.nextLine().split("\\s+"))
                .filter(startsWithUpperCase)
                .collect(Collectors.toList());

        System.out.println(collect.size());
        collect.forEach(e-> System.out.println(String.join(System.lineSeparator(),e)));

    }

}
