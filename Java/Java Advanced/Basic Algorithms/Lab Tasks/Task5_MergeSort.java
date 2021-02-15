import java.util.Arrays;
import java.util.Scanner;

public class Task5_MergeSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = mergeSort(Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray());

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    private static int[] mergeSort(int[] array) {
        if (array.length == 1) {
            return array;
        }

        int middleIndex = array.length / 2;
        int[] firstHalf = Arrays.copyOfRange(array, 0, middleIndex);
        int[] secondHalf = Arrays.copyOfRange(array, middleIndex, array.length);

        firstHalf = mergeSort(firstHalf);
        secondHalf = mergeSort(secondHalf);

        return mergeTwoSortedArrays(firstHalf, secondHalf);
    }

    private static int[] mergeTwoSortedArrays(int[] firstHalf, int[] secondHalf) {
        int[] sorted = new int[firstHalf.length + secondHalf.length];
        int firstIndex = 0;
        int secondIndex = 0;

        while (firstIndex < firstHalf.length && secondIndex < secondHalf.length) {
            if (firstHalf[firstIndex] < secondHalf[secondIndex]) {
                sorted[firstIndex + secondIndex] = firstHalf[firstIndex];
                firstIndex++;
            } else {
                sorted[firstIndex + secondIndex] = secondHalf[secondIndex];
                secondIndex++;
            }
        }

        while (firstIndex < firstHalf.length) {
            sorted[firstIndex + secondIndex] = firstHalf[firstIndex];
            firstIndex++;

        }

        while (secondIndex < secondHalf.length) {
            sorted[firstIndex + secondIndex] = secondHalf[secondIndex];
            secondIndex++;
        }


        return sorted;
    }
}
