import java.util.Scanner;
//100/100
public class Task1_WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder(input);

        while (true) {
            String s = scanner.nextLine();
            if (s.equals("Travel")) {
                break;
            }

            String[] data = s.split(":");
            String command = data[0];

            switch (command) {
                case "Add Stop":
                    int index = Integer.parseInt(data[1]);
                    String givenString = data[2];
                    sb.insert(index, givenString);
                    System.out.println(sb);
                    break;
                case "Remove Stop":
                    int startIndex = Integer.parseInt(data[1]);
                    int endIndex = Integer.parseInt(data[2]);

                    if (startIndex >= 0 &&
                            startIndex < sb.length()
                            && endIndex >= 0 && endIndex < sb.length()) {
                        sb.delete(startIndex, endIndex + 1);
                    }
                    System.out.println(sb);
                    break;
                case "Switch":
                    String toCheck = sb.toString();
                    String oldString = data[1];
                    String newString = data[2];
                    if (toCheck.contains(oldString)) {

                        replaceAll(sb, oldString, newString);
                        System.out.println(sb);
                    }
                    break;
            }


        }
        System.out.println("Ready for world tour! Planned stops: " + sb);
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
