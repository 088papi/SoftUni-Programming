import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task1Resolve_SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> nums = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        nums.removeIf(e -> e % 2 != 0);
        printList(nums);
        nums.sort(Integer::compareTo);
        printList(nums);
    }
    private static void printList(List<Integer> nums) {
        if (!nums.isEmpty()) {
            for (int i = 0; i < nums.size(); i++) {
                System.out.print(nums.get(i));
                if (i < nums.size()-1) {
                    System.out.print(", ");
                }
            }
        }
        System.out.println();
    }
}
