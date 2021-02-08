package Task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Box<String> box = new Box<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            box.addElement(scanner.nextLine());
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
