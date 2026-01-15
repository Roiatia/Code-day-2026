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
        String ANSI_RESET = "\u001B[0m";
        String ANSI_BLUE = "\u001B[34m";

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(mat[i][j] == 1)
                    System.out.print(ANSI_BLUE + mat[i][j] + ANSI_RESET);
                else  System.out.print(mat[i][j]);
                if(j != mat[i].length - 1)
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

}
