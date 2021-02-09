package Task11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] data1 = scanner.nextLine().split("\\s+");
        Threeuple<String,String,String> threeuple = new Threeuple<String, String, String>(
                data1[0] + " " + data1[1], data1[2], data1[3]);

        String[] data2 = scanner.nextLine().split("\\s+");

        boolean isDrunk = false;
        if (data2[2].equals("drunk")){
            isDrunk = true;
        }
        Threeuple<String,Integer, Boolean> threeuple1 = new Threeuple<>(data2[0],Integer.parseInt(data2[1]), isDrunk);

        String[] data3 = scanner.nextLine().split("\\s+");

        Threeuple<String, Double, String> threeuple2 = new Threeuple<>(data3[0], Double.parseDouble(data3[1]), data3[2]);

        System.out.println(threeuple.toString());
        System.out.println(threeuple1.toString());
        System.out.println(threeuple2.toString());


    }
}
