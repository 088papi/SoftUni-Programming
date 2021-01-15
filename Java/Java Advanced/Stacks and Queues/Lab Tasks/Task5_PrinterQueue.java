import java.util.ArrayDeque;
import java.util.Scanner;
//submit
public class Task5_PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> files = new ArrayDeque<>();

        String file = scanner.nextLine();

        while (!file.equals("print")){

        if (file.equals("cancel")){
            if (files.isEmpty()){
                System.out.println("Printer is on standby");
            }else {
                System.out.println("Canceled " + files.pollFirst());
            }

        } else {
            files.offer(file);

        }
            file = scanner.nextLine();
        }

        for (String doc : files) {
            System.out.println(doc);
        }


    }
}
