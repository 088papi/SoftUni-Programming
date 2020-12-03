import java.util.Scanner;
// 100/100
public class Task4_ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");
        int rotation = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < rotation; i++) {
            String firstElement = array[0];
            for (int j = 0; j <  array.length-1; j++) {
                array[j] = array[j + 1];
            }
            //add first element to last position;
            array[array.length - 1] = firstElement;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
