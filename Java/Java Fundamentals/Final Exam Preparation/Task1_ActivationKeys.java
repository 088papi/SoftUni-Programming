import java.util.Scanner;
//100/100
public class Task1_ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rawActivationKey = scanner.nextLine();
        StringBuilder activationKey = new StringBuilder(rawActivationKey);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Generate")) {
                break;
            }

            String[] data = input.split(">>>");
            String command = data[0];
            switch (command) {
                case "Contains":
                    String substring = data[1];
                    String toCheck = activationKey.toString();

                    if (toCheck.contains(substring)) {
                        System.out.printf("%s contains %s%n", toCheck, substring);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    int startIndex = Integer.parseInt(data[2]);
                    int endIndex = Integer.parseInt(data[3]);
                    String upperOrLower = data[1];
                    if (upperOrLower.equals("Upper")) {
                         substring = activationKey.substring(startIndex,endIndex).toUpperCase();
                       activationKey.replace(startIndex,endIndex,substring);
                        System.out.println(activationKey);
                    } else if (upperOrLower.equals("Lower")){
                        substring = activationKey.substring(startIndex,endIndex).toLowerCase();
                        activationKey.replace(startIndex,endIndex,substring);
                        System.out.println(activationKey);
                    }
                    break; // check
                case "Slice":
                    startIndex = Integer.parseInt(data[1]);
                    endIndex = Integer.parseInt(data[2]);

                    activationKey.delete(startIndex, endIndex);
                    System.out.println(activationKey);
                    break;
            }



        }
        System.out.println("Your activation key is: " + activationKey);

    }
}
