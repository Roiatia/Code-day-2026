package EXE_1;

import java.util.Random;

public class PrintBoard {

    public static void genBoard(int [][] mat) {
        Random rand = new Random();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = rand.nextInt(2); // Generates either 0 or 1
            }
        }
    }

    public static void printMat(int [][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

}
