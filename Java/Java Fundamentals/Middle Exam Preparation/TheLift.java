import java.util.Arrays;
import java.util.Scanner;

//88/100
public class TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tourists = Integer.parseInt(scanner.nextLine());
        int index = 0;
        int[] wagons = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        while (tourists > 0) {


            if (index >= wagons.length) {
                System.out.println("There isn't enough space! " + tourists + " people in a queue!");
                for (int wagon : wagons) {
                    System.out.print(wagon + " ");
                }
                return;
            }
            while (wagons[index] < 4) {
                if (tourists == 0) {
                    System.out.println("The lift has empty spots!");
                    for (int wagon : wagons) {
                        System.out.print(wagon + " ");
                    }
                    return;
                }


                tourists -= 1;
                wagons[index] += 1;

            }

            index++;


        }

        for (int wagon : wagons) {
            System.out.print(wagon + " ");
        }

    }

    }























