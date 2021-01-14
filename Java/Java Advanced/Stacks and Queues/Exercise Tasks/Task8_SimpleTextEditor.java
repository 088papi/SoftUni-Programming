import java.util.ArrayDeque;
import java.util.Scanner;

public class Task8_SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numberOfCommands = Integer.parseInt(scanner.nextLine());
            StringBuilder text = new StringBuilder();
        ArrayDeque<String> memoryStack = new ArrayDeque<>();

        for (int i = 0; i <numberOfCommands ; i++) {
            String[] commandData = scanner.nextLine().split("\\s+");
            String argument = "";

            if(commandData.length > 1) {
            argument = commandData[1];
            }
            switch (commandData[0]){
                case "1":
                    memoryStack.push(text.toString());
                    text.append(argument);

                    break;
                case "2":
                    memoryStack.push(text.toString());
                    int count = Integer.parseInt(argument);
                    int start = text.length()-count;
                    text.delete(start, start+count);
                    break;
                case "3":
                    int index = Integer.parseInt(argument);
                    System.out.println(text.charAt(index-1));
                    break;
                case "4":
                    if (!memoryStack.isEmpty()){
                       text = new StringBuilder(memoryStack.pop());
                    }
                    break;


            }


        }
    }
}
