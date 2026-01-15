package Conways_game_of_Life;

public class Rules {
    public int countAliveNeighbors(Board board , int r, int c) {
        int count = 0;
        for(int i = r -1; i < r + 1 ; i++ ) {
            for(int j = c - 1; j < c + 1; j++) {
                if(i == r && j == c) {
                   count += board.getCells(i, j);
                }
            }
        }
        return count;
    }

}
