import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Task8_BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<String> historyStack = new ArrayDeque<>();
        Deque<String> forwardQueue = new ArrayDeque<>();

        String command = scanner.nextLine();


        while (!command.equals("Home")) {

            if (command.equals("back")) {
                if (historyStack.size() < 2) {
                    System.out.println("no previous URLs");
                } else {
                    forwardQueue.addFirst(historyStack.peek());
                    historyStack.pop();
                    System.out.println(historyStack.peek());
                }
            } else if (command.equals("forward")) {
                if (forwardQueue.size() < 1){
                    System.out.println("no next URLs");
                } else {
                    System.out.println(forwardQueue.peek());
                    historyStack.push(forwardQueue.poll());
                }
            } else{
                historyStack.push(command);
                System.out.println(command);
                forwardQueue.clear();

            }
            command = scanner.nextLine();
        }
    }
}
