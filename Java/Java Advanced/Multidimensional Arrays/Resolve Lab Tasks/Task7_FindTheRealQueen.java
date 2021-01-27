import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task9_FindTheRealQueen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] chessBoard = new String[8][8];

        int[] bestCells = new int[2];

        for (int i = 0; i < chessBoard.length; i++) {
            chessBoard[i] = scanner.nextLine().split("\\s+");
        }


        for (int row = 0; row < chessBoard.length; row++) {
            for (int col = 0; col < chessBoard[row].length; col++) {
                if (chessBoard[row][col].equals("q")) {
                    if (       !CheckUp(chessBoard, row, col)
                            && !CheckDown(chessBoard, row, col)
                            && !CheckLeft(chessBoard, row, col)
                            && !CheckRight(chessBoard, row, col)
                            && !CheckUpperLeftDiagonal(chessBoard, row, col)
                            && !CheckUpperRightDiagonal(chessBoard, row, col)
                            && !CheckLowerLeftDiagonal(chessBoard, row, col)
                            && !CheckLowerRightDiagonal(chessBoard, row, col)
                    ) {
                        bestCells[0] = row;
                        bestCells[1] = col;
                    }
                }
            }
        }


        for (int bestCell : bestCells) {
            System.out.print(bestCell + " ");
        }
    }

    private static boolean CheckLowerRightDiagonal(String[][] chessBoard, int row, int col) {

        col = col + 1;

        for (int i = row + 1; i < 8 && col < 8; i++, col++) {
            if (chessBoard[i][col].equals("q")) {
                return true;
            }
        }
        return false;
    }

    private static boolean CheckLowerLeftDiagonal(String[][] chessBoard, int row, int col) {
        col = col - 1;
        for (int i = row + 1; i < 8 && col >= 0; i++, col--) {
            if (chessBoard[i][col].equals("q")) {
                return true;
            }
        }


        return false;
    }

    private static boolean CheckUpperRightDiagonal(String[][] chessBoard, int row, int col) {
        col = col + 1;
        for (int i = row - 1; i >= 0 && col < 8; i--, col++) {
            if (chessBoard[i][col].equals("q")) {
                return true;
            }
        }


        return false;
    }


    private static boolean CheckUpperLeftDiagonal(String[][] chessBoard, int row, int col) {

        col = col - 1;
        for (int i = row - 1; i >= 0 && col >= 0; i--, col--) {
            if (chessBoard[i][col].equals("q")) {
                return true;
            }
        }


        return false;
    }

    private static boolean CheckDown(String[][] chessBoard, int row, int col) {

        for (int i = row + 1; i < 8; i++) {
            if (chessBoard[i][col].equals("q")) {
                return true;
            }
        }

        return false;
    }

    private static boolean CheckRight(String[][] chessBoard, int row, int col) {
        for (int i = col + 1; i < 8; i++) {
            if (chessBoard[row][i].equals("q")) {
                return true;
            }
        }

        return false;
    }

    private static boolean CheckUp(String[][] chessBoard, int row, int col) {
        for (int i = row - 1; i >= 0; i--) {

            if (chessBoard[i][col].equals("q")) {
                return true;

            }
        }
        return false;

    }

    private static boolean CheckLeft(String[][] chessBoard, int row, int col) {
        for (int i = col - 1; i >= 0; i--) {
            if (chessBoard[row][i].equals("q")) {
                return true;
            }
        }

        return false;
    }
}

