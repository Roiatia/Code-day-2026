package Conways_game_of_Life;

public class Board {
    private int[][] grid;

    public Board(int rows, int cols) {
        grid = new int[rows][cols];
    }

    public int getCells(int r, int c) {
        //Cells outside the board are considered dead
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length) {
            return 0; // Out of bounds, treat as dead cell
        }
        return grid[r][c];
    }

    public void setCell(int r, int c, int value) {
            grid[r][c] = value;

    }

    public int getRows(int rows) {
        return grid.length;
    }

    public int getCols(int cols) {
        return grid[0].length;
    }
}
