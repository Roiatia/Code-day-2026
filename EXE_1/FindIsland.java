package EXE_1;

public class FindIsland {
    private int countIslands = 0;

    // finds islands in a given matrix
    public void findIsland(int[][] mat) {
        this.countIslands = 0;
        boolean[][] found = new boolean[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length ; j++) {
                if (mat[i][j] == 1 && !found[i][j]) {
                    countIslands++; // If we find a land cell that hasn't been found yet

                    checkNeighbors(mat, found, i, j); // Check all connected land cells

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
            // Recursively check all four neighbors
            // in all directions
            checkNeighbors(mat, found, i - 1, j); // up
            checkNeighbors(mat, found, i + 1, j); // down
            checkNeighbors(mat, found, i, j - 1); // left
            checkNeighbors(mat, found, i, j + 1);   // right
        }


    public int getCountIslands() {
        return countIslands;
    }
}
