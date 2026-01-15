package EXE_1;

import java.util.Random;

public class PrintBoard {
    private static final int ROWS = 10;
    private static final int COLS = 10;
    private static int[][] mat;

    // initilizes the board
    public static void init()
    {
        mat = new int[ROWS][COLS];
        genBoard(mat);
    }

    public static int[][] getMat()
    {
        return mat;
    }

    //generates a random board with 0s and 1s
    public static void genBoard(int [][] mat) {
        Random rand = new Random();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = rand.nextInt(2); // Generates either 0 or 1
            }
        }
    }

    //prints the board
    public static void printMat(int [][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

}
