import java.util.Scanner;
//100/100
public class Task2_CommonElements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] firstArr = scanner.nextLine().split(" ");
        String[] secondArr = scanner.nextLine().split(" ");

        for (int i = 0; i < secondArr.length; i++) {

            for (int j = 0; j < firstArr.length ; j++) {

                if (secondArr[i].equals(firstArr[j])) {
                    System.out.print(secondArr[i] + " ");
                }
            }
        }

        // прочиташ два масива от стринг и
        // трябва да сравним елементите
        // фор --> secondArray {
        //вложен фор --> firstArray {
        //if secondArray[i].equals (firstArray[i]);
        //if equals --> print
    }
}
