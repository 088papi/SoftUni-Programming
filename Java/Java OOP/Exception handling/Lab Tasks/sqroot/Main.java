package sqroot;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            int n = Integer.parseInt(scanner.nextLine());
            System.out.println(Math.sqrt((double) n));
        }catch (NumberFormatException e){
            System.out.println("Invalid number");

        } finally {
            System.out.println("Good bye");
        }

    }
}
