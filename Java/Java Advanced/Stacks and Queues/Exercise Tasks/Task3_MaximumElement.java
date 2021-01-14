import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Task3_MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int commands = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        for(int i = 0; i < commands; i++){
           int[] command = Arrays.stream(scanner.nextLine().split(" "))
                   .mapToInt(Integer::parseInt).toArray();


           switch (command[0]){
               case 1:
                   numbers.push(command[1]);
                   break;
               case 2:

                   if (!numbers.isEmpty()){
                       numbers.pop();
                   }
                   break;
               case 3:
                   System.out.println(Collections.max(numbers));
                   break;

           }
        }
    }
}
