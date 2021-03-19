package person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        try{
            new Person("Pesho", "Peshov", 16);;
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
