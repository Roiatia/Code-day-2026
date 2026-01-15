package Conways_game_of_Life;

public class Rules {
   // Implements classic Conway's rules
        public int calculateNextState(int currentState, int aliveNeighbors) {
            if (currentState == 1) { // Alive cell
                // Less than 2 neighbors or more than 3 - dies
                if (aliveNeighbors < 2 || aliveNeighbors > 3) return 0;
                // 2 or 3 neighbors - stays alive
                return 1;
            } else { // Dead cell
                // Exactly 3 neighbors - becomes alive
                if (aliveNeighbors == 3) return 1;
                return 0;
            }
        }
    }
