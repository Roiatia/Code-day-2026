package EXE_1;

public class FindIsland {
    private int countIslands = 0;

    public void findIsland(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        boolean[] cached = new boolean[rows * cols];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                int currentNum = mat[i][j];
                if(currentNum == 1 && !cached[i * cols + j]) {
                    countIslands++;
                    //mark all connected 1

                }
            }


        }


    }
    public int getCountIslands() {
        return countIslands;
    }


    // isCached(i, j)
    // setCached(i, j)


}
