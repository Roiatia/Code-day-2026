package EXE_1;

public class FindIsland {
    private int countIslands = 0;

    public void findIsland(int[][] mat) {
        boolean[][] found = new boolean[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; i < mat[i].length; j++) {
                if (mat[i][j] == 1 && !found[i][j]) {
                    countIslands++;

                }
            }
        }
    }

        public static void checkNeighbors ( int[][] mat, boolean[][] found, int i, int j) {
            if (i < 0 || j < 0 || i >= mat.length || j >= mat[i].length) {
                return;
            }
            if (mat[i][j] == 0 || found[i][j]) {
                return;
            }
            found[i][j] = true;
            checkNeighbors(mat, found, i - 1, j);
            checkNeighbors(mat, found, i + 1, j);
            checkNeighbors(mat, found, i, j - 1);
            checkNeighbors(mat, found, i, j + 1);
        }


    public int getCountIslands() {
        return countIslands;
    }
}
