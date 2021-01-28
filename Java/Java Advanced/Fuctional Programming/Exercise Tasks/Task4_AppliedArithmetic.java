import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task4_AppliedArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] nums = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        String command = scanner.nextLine();

        Function<int[], int[]> add = e -> Arrays.stream(e).map(num -> num+=1).toArray();
        Function<int[], int[]> subtract = e -> Arrays.stream(e).map(num -> num-=1).toArray();
        Function<int[], int[]> multiply = e -> Arrays.stream(e).map(num -> num *= 2).toArray();

        Consumer<int[]> printer = e -> Arrays.stream(e).forEach(a -> System.out.print(a + " "));

        while (!command.equals("end")){
            switch (command){
                case "add":
                    nums = add.apply(nums);
                    break;
                case "multiply":
                    nums = multiply.apply(nums);
                    break;
                case "subtract":
                    nums = subtract.apply(nums);
                    break;
                case "print":
                    printer.accept(nums);
                    System.out.println();
                    break;
            }


            command =  scanner.nextLine();
        }

    }
}