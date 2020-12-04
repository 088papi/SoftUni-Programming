import java.util.Scanner;
//100/100
public class Task1_SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String concealedMessage = scanner.nextLine();
        StringBuilder message = new StringBuilder(concealedMessage);
        String input = scanner.nextLine();


        while (!input.equals("Reveal")) {

            String[] data = input.split(":\\|:");
            String instruction = data[0];
            String toCheck = message.toString();

            switch (instruction) {
                case "InsertSpace":
                    int index = Integer.parseInt(data[1]);
                    message.insert(index, " "); // done
                    System.out.println(message);
                    break;
                case "Reverse":
                    String substring = data[1];
                    if (toCheck.contains(substring)) {
                        int startIndex = message.indexOf(substring);
                        int endIndex = startIndex + substring.length();
                        message.delete(startIndex, endIndex);
                        String reversed = ReverseString(substring);
                        message.append(reversed);
                        System.out.println(message);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "ChangeAll":
                    substring = data[1];
                    String replacement = data[2];

                    replaceAll(message, substring, replacement);
                    System.out.println(message);


            }

            input = scanner.nextLine();
        }
        System.out.println("You have a new text message: " + message);
    }

    public static String ReverseString(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        return reversed;
    }

    public static void replaceAll(StringBuilder builder, String substring, String replacement) {
        int index = builder.indexOf(substring);
        while (index != -1) {
            builder.replace(index, index + substring.length(), replacement);
            index += replacement.length(); // Move replacement the end of the replacement
            index = builder.indexOf(substring, index);
        }
    }
}
