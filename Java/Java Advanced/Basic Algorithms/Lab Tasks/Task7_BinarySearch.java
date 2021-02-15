import java.util.Arrays;
import java.util.Scanner;

public class Task7_BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();


        int targetIndex = Integer.parseInt(scanner.nextLine());

        int index = binarySearch(nums, targetIndex, 0, nums.length-1);
        System.out.println(index);
    }

    private static int binarySearch(int[] nums, int targetIndex, int start, int end) {
        while (end >= start){
            int half = (start+end) /2;
            if (nums[half] < targetIndex){
                start = half + 1;
            } else if (nums[half] > targetIndex){
                end = half-1;
            } else {
                return half;
            }
        }


        return -1;
    }
}
