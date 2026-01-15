package EXE_1;

import static EXE_1.PrintBoard.genBoard;

public class Main {
    public static void main(String[] args) {
        PrintBoard board = new PrintBoard();
        board.init();
        int[][] mat = board.getMat();
        System.out.println("Generated Board:");
        board.printMat(mat);

        FindIsland finder = new FindIsland();
        finder.findIsland(mat);
        int islandCount = finder.getCountIslands();
        System.out.println("Number of islands found: " + islandCount);
    }
}
