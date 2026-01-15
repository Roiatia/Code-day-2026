package EXE_1;

import static EXE_1.PrintBoard.genBoard;

public class Main {
    public static void main(String[] args) {
        int[][] mat = new int[5][5];
        genBoard(mat);
        PrintBoard.printMat(mat);
        FindIsland finder = new FindIsland();
        finder.findIsland(mat);
        System.out.println("Number of islands: " + finder.getCountIslands());
    }
}
