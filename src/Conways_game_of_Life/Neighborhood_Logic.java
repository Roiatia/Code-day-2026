package Conways_game_of_Life;

public class Neighborhood_Logic {
     // Counts up to 8 neighbors (horizontal, vertical, and diagonal)
        public int countAliveNeighbors(Board board, int row, int col) {
            int count = 0;
            for (int i = row - 1; i <= row + 1; i++) {
                for (int j = col - 1; j <= col + 1; j++) {
                    // Skip the cell itself
                    if (i == row && j == col) continue;
                    count += board.getCells(i, j);
                }
            }
            return count;
        }
    }

