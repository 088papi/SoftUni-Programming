import java.util.Scanner;

public class Task6_CalculateRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
int area = getRectangleArea(a,b);
        System.out.println(area);
    }

    static int getRectangleArea(int width, int height) {
        return width * height;
    }
}
