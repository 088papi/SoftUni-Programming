import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Task1_BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<String> history = new ArrayDeque<>();

        String currentURL = null;
        String command = scanner.nextLine();
        while (!command.equals("Home")){


            if (command.equals("back")) {
            if (history.isEmpty()){
                System.out.println("no previous URLs");
                command = scanner.nextLine();
                continue;
            } else {
                currentURL = history.pop();
            }

            } else {
                if (currentURL != null) {
                    history.push(currentURL);
                }

                currentURL = command;
            }

            System.out.println(currentURL);


            command = scanner.nextLine();

        }

    }
}
