import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class Task6_PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        String[] names = scanner.nextLine().split("\\s+");

        Predicate<String> checkNames =  name -> name.length() <= length;

        Arrays.stream(names).filter(checkNames).forEach(System.out::println);
    }
}
