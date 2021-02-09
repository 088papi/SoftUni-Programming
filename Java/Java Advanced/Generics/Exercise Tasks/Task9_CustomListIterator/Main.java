package Task9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        CustomList<String> customList = new CustomList<>();

        while (!input.equals("END")) {
            String[] data = input.split("\\s+");
            String command = data[0];

            String element;
            switch (command) {
                case "Add":
                    element = data[1];
                    customList.add(element);
                    break;
                case "Remove":
                    element = data[1];
                    customList.remove(Integer.parseInt(element));
                    break;
                case "Contains":
                    element = data[1];
                    System.out.println(customList.contains(element));
                    break;
                case "Swap":
                    element = data[1];
                    int index2 = Integer.parseInt(data[2]);
                    customList.swap(Integer.parseInt(element), index2);
                    break;
                case "Greater":
                    element = data[1];
                    System.out.println(customList.countGreater(element));
                    break;
                case "Max":
                    System.out.println(customList.getMax());
                    break;
                case "Min":
                    System.out.println(customList.getMin());
                    break;
                case "Sort":
                    Sorter.sort(customList);
                    break;

                case "Print":
                    System.out.println(customList.print().trim());
                    break;


            }


            input = scanner.nextLine();
        }


    }

}
