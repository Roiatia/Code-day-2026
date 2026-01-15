package Conways_game_of_Life;

public class Display_Engine {
    public void printBoard(Board board) {
            // Clear console (Optional)
            System.out.print("\033[H\033[2J");
            System.out.flush();

            for (int r = 0; r < board.getRows(); r++) {
                for (int c = 0; c < board.getCols(); c++) {
                    // Text representation: 1 for Alive, 0 for Dead
                    System.out.print(board.getCells(r, c) == 1 ? "1 " : "0 ");
                }
                System.out.println();
            }
        }
    }

