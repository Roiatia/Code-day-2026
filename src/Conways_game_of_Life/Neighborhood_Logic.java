package Conways_game_of_Life;

public class Neighborhood_Logic {
    public int getNextState(int currentState, int aliveNeighbors) {
        if(currentState == 1) { // Cell is currently alive
            if(aliveNeighbors < 2 || aliveNeighbors > 3) {
                return 0; // Cell dies
            } else {
                return 1; // Cell lives
            }
        } else { // Cell is currently dead
            if(aliveNeighbors == 3) {
                return 1; // Cell becomes alive
            } else {
                return 0; // Cell remains dead
            }
        }
    }

}
