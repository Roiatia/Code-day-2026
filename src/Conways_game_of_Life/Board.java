package Conways_game_of_Life;

public class Board {
    private int[][] grid;
    private String topology; // Added to store the board behavior

    public Board(int rows, int cols, String topology) {
        this.grid = new int[rows][cols];
        this.topology = topology;
    }

    public int getCells(int r, int c) {
        int rows = grid.length;
        int cols = grid[0].length;

        // Logic based on selected topology
        if (topology.equals("finite")) {
            // Out of bounds are considered dead
            if (r < 0 || r >= rows || c < 0 || c >= cols) return 0;
            return grid[r][c];
        }

        else if (topology.equals("horizontal_cylindrical")) {
            // Horizontal wrapping (left-right), vertical is fixed boundary
            if (r < 0 || r >= rows) return 0;
            int wrappedC = (c % cols + cols) % cols; // Handles negative indices
            return grid[r][wrappedC];
        }

        else if (topology.equals("vertical_cylindrical")) {
            // Vertical wrapping (up-down), horizontal is fixed boundary
            if (c < 0 || c >= cols) return 0;
            int wrappedR = (r % rows + rows) % rows; // Handles negative indices
            return grid[wrappedR][c];
        }

        return 0;
    }

    public void setCell(int r, int c, int value) {
        grid[r][c] = value;
    }

    public int getRows() { return grid.length; }
    public int getCols() { return grid[0].length; }
    public String getTopology() { return topology; }
}