package EXE_1;

import java.util.Random;

public class PrintBoard  {
    int mat[][] = new int[10][10];

    public static void printMat(int[][] mat)
    {
        for(int i = 0; i < mat.length; i++)
            for(int j = 0; j < mat[i].length; j++)
                System.out.println(mat[i][j] + ((j != mat[i].length - 1) ? " " : ""));
    }

    public static void RandomMat(int [][] mat) {
        Random rand = new Random();
      for(int i  = 0; i < mat.length; i++) {
          for(int j = 0; j < mat[i].length;) {
              mat[i][j] = rand.nextInt() + 1;
          }
          printMat(mat);
      }
    }


}
