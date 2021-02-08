package Task4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Box<Integer> box = new Box<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            box.addElement(Integer.parseInt(scanner.nextLine()));
        }

        int[] swapIndexes = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int firstIndex = swapIndexes[0];
        int secondIndex = swapIndexes[1];

        box.swap(firstIndex,secondIndex);

        System.out.println(box.toString());


    }



}




