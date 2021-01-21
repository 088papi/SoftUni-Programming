import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Task2_SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        Set<String> set1 = new LinkedHashSet<>();
        Set<String> set2 = new LinkedHashSet<>();


        for (int i = 0; i < nums[0] ; i++) {
            set1.add(scanner.nextLine());
        }

        for (int i = 0; i < nums[1]; i++) {
            set2.add(scanner.nextLine());
        }
        set1.forEach((e)-> {
            if (set2.contains(e)){
                System.out.print(e + " ");
            }
        });

    }
}
