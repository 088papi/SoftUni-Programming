import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task2_PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[][] matrix = new int[dimensions[0]][dimensions[1]];

        for (int r = 0; r < matrix.length; r++) {
            String[] tokens = scanner.nextLine().split(" ");

            for (int c = 0; c < matrix[r].length; c++) {
                matrix[r][c] = Integer.parseInt(tokens[c]);
            }
        }

        int number = Integer.parseInt(scanner.nextLine());

        List<int[]> indexes = new ArrayList<>();

        for (int r = 0; r < matrix.length ; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                if (matrix[r][c] == number){
                    int[] arr = new int[2];
                    arr[0] = r;
                    arr[1] = c;
                    indexes.add(arr);
                }
            }
        }

        if (indexes.isEmpty()){
            System.out.println("not found");
        } else {
            for (int i = 0; i < indexes.size() ; i++) {
                int[] current = indexes.get(i);
                for (int j = 0; j < current.length ; j++) {
                    System.out.print(current[j] + " ");
                }
                System.out.println();
            }
            }
        }

    }

