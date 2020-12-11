import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//100/100
public class Task5_Html {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String title = scanner.nextLine();
        String content = scanner.nextLine();

        String comment = scanner.nextLine();
        List<String> allComments = new ArrayList<>();
        while (!comment.equals("end of comments")) {

            allComments.add(comment);


            comment = scanner.nextLine();

        }

        System.out.printf("<h1>%n    %s%n</h1>%n", title);
        System.out.printf("<article>%n    %s%n</article>%n", content);

        allComments.forEach((a-> System.out.printf("<div>%n    %s%n</div>%n",a)));
    }
}
