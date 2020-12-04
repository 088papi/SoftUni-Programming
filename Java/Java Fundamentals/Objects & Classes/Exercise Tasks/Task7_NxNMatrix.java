import java.util.Scanner;
//100/100
public class Task7_NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        printNxN(n);


    }

    public static void printNxN(int n) {
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print(n+" ");
            }
            System.out.println();
        }
    }
}
