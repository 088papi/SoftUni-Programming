import java.util.Scanner;

public class Problem1WithString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        String input = scanner.nextLine();


        String one = scanner.nextLine();
        while (!one.equals("End")) {

            String[] data = one.split(" ");
            String command = data[0];

            switch (command) {
                case "Translate":
                    String c = data[1];
                    String replacement = data[2];

                    input = input.replaceAll(c,replacement);

                    System.out.println(input);

                    break;

                case "Includes":
                    String otherString = data[1];
                    if (input.contains(otherString)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "Start":
                    String string = data[1];
                    if (input.contains(string)) {
                        if (input.startsWith(string)) {
                            System.out.println("True");
                        }
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "Lowercase":
                    input = input.toLowerCase();
                    System.out.println(input);
                    break;
                case "FindIndex":
                    String character = data[1];
                        System.out.println(input.lastIndexOf(character));

                    break;
                case "Remove":
                    int startIndex = Integer.parseInt(data[1]);
                    int count = Integer.parseInt(data[2]);

                    if (startIndex >= 0 && startIndex <= input.length()-1 &&
                    count >= 0 && count <= input.length()-1) {

                        String substring = input.substring(startIndex, count + startIndex);

                        input = input.replace(substring, "");


                    }
                    System.out.println(input);
                    break;

            }


            one = scanner.nextLine();
        }


    }
}
