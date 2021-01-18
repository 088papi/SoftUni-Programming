import java.util.ArrayDeque;
import java.util.Scanner;

public class Task1_BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        ArrayDeque<String> backHistory = new ArrayDeque<>();
        while (!input.equals("Home")){

          if (input.equals("back")){
              if (backHistory.size() < 2) {
                  System.out.println("no previous URLs");
              } else {
                  backHistory.pop();
                  System.out.println(backHistory.peek());
              }

            } else {
              backHistory.push(input);
              System.out.println(input);
          }




            input = scanner.nextLine();
        }



    }
}
