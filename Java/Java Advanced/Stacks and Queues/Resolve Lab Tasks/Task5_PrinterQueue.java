import com.sun.security.jgss.GSSUtil;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Task5_PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<String> filesQueue = new ArrayDeque<>();
        while (!input.equals("print")){
            if (input.equals("cancel")){
                if (filesQueue.isEmpty()){
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + filesQueue.poll());
                }
            } else {
                filesQueue.offer(input);
            }



            input = scanner.nextLine();
        }


        while (!filesQueue.isEmpty()) {
            System.out.println(filesQueue.poll());
        }
    }
}

