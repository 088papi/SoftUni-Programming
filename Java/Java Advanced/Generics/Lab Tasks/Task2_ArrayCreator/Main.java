import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer[] array = ArrayCreator.create(13,13);
        String[] strings = ArrayCreator.create(String.class,13, "Java");

        for (Integer integer : array) {
            System.out.println(integer);
        }
    }
}
