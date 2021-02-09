package Task10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        String[] input = scanner.nextLine().split("\\s+");
        String name =input[0] + " " + input[1];
        String address = input[2];

        Tuple<String,String> tuple1 = new Tuple<>(name,address);

        String[] input2 = scanner.nextLine().split("\\s+");
        name = input2[0];
        address = input2[1];
        Tuple<String,String> tuple2 = new Tuple<>(name,address);

        String[] input3 = scanner.nextLine().split("\\s+");

        Tuple<Integer,Double> tuple3 = new Tuple<>(Integer.parseInt(input3[0]),Double.parseDouble(input3[1]));

        System.out.println(tuple1.toString());
        System.out.println(tuple2.toString());
        System.out.println(tuple3.toString());


    }
}
