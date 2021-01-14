import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Task1_ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayDeque<Integer> reversed = new ArrayDeque<>();

        String[] input = scanner.nextLine().split(" ");



        for(int i = 0; i < input.length; i++) {
        reversed.push(Integer.parseInt(input[i]));
        }



        for (int num:reversed) {
            System.out.print(reversed.pop() + " ");
        }
    }
}
