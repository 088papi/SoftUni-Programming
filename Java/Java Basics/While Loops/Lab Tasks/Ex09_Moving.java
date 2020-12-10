import javax.swing.*;
import java.util.Scanner;
// РЕШЕНА - ПРОВЕРИ В ДЖЪДЖ
public class Ex09_Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int widthSpace = Integer.parseInt(scanner.nextLine());
        int lengthSpace = Integer.parseInt(scanner.nextLine());
        int heightSpace = Integer.parseInt(scanner.nextLine());
        int volumeSpace = widthSpace * lengthSpace * heightSpace;
        String input = scanner.nextLine(); // input = number boxes

        int sumBoxes = 0;

        while (!input.equals("Done")) {


            sumBoxes += Integer.parseInt(input);
            if (sumBoxes > volumeSpace) {
                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(sumBoxes - volumeSpace));
                return;
            }
            input = scanner.nextLine();
        }


        if (sumBoxes <= volumeSpace) {
            System.out.printf("%d Cubic meters left.", Math.abs(volumeSpace - sumBoxes));

        }


    }


}
