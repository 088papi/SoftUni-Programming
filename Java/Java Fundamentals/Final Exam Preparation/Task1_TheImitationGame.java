import java.util.Scanner;
//100/100
public class Task1_TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String encryptedMsg = scanner.nextLine();
        StringBuilder newMsg = new StringBuilder(encryptedMsg);


        while (true) {
            String input = scanner.nextLine();

            if (input.equals("Decode")) {
                break;
            }

            String[] data = input.split("\\|");
            String command = data[0];

            switch (command) {
                case "Move":

                    int startIndex = 0;
                    int endIndex = Integer.parseInt(data[1]);
                    String toBeAdded = newMsg.substring(startIndex, endIndex);
                    newMsg.delete(startIndex, endIndex);
                    newMsg.append(toBeAdded);
                    break;
                case "Insert":
                    int index = Integer.parseInt(data[1]);
                    String value = data[2];
                    newMsg.insert(index, value);

                    break;

                case "ChangeAll":
                    String substring = data[1];
                    String replacement = data[2];
                    replaceAll(newMsg, substring, replacement);
                    break;
            }


        }
        System.out.println("The decrypted message is: " + newMsg);

    }

    public static void replaceAll(StringBuilder builder, String from, String to) {
        int index = builder.indexOf(from);
        while (index != -1) {
            builder.replace(index, index + from.length(), to);
            index += to.length(); // Move to the end of the replacement
            index = builder.indexOf(from, index);
        }


    }
}
