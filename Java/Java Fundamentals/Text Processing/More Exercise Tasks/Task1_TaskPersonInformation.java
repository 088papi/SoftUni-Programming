import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
//100/100
public class Task1_TaskPersonInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <n ; i++) {
            String input = scanner.nextLine();
            int startIndexOfName = input.indexOf('@') + 1;
            int lastIndexOfName = input.indexOf('|');

            int startIndexAge = input.indexOf('#') + 1;
            int endIndexAge = input.indexOf('*');
            String name = input.substring(startIndexOfName,lastIndexOfName);
            String age = input.substring(startIndexAge, endIndexAge);

            System.out.println(name + " is " + age + " years old.");

        }





        }


    }

