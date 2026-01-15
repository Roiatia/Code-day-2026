package Conways_game_of_Life;
import java.util.Scanner;
import java.util.Random;

public class Simulation_Engine {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            Random random = new Random();

            // 1. Get Board Dimensions
            System.out.print("Enter number of rows: ");
            int rows = input.nextInt();
            System.out.print("Enter number of columns: ");
            int cols = input.nextInt();

            // 2. Get Simulation Speed
            System.out.print("Enter delay (in tenths of a second, e.g., 5 for 0.5s): ");
            int delay = input.nextInt();

            // 3. Choose Topology
            System.out.println("Choose Board Topology:");
            System.out.println("1 - Finite Board");
            System.out.println("2 - Horizontal Cylindrical (Left-Right wrap)");
            System.out.println("3 - Vertical Cylindrical (Up-Down wrap)");
            int choice = input.nextInt();

            String topologyType = "finite";
            if (choice == 2) topologyType = "horizontal_cylindrical";
            else if (choice == 3) topologyType = "vertical_cylindrical";

            // 4. Initialize Board with Random Cells
            Board currentBoard = new Board(rows, cols, topologyType);
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    // Randomly set cells as 1 (alive) or 0 (dead)
                    currentBoard.setCell(i, j, random.nextInt(2));
                }
            }

            // Component initialization
            Neighborhood_Logic neighborLogic = new Neighborhood_Logic();
            Rules rules = new Rules();
            Display_Engine display = new Display_Engine();

            // 5. Main Simulation Loop
            while (true) {
                display.printBoard(currentBoard);

                // Create next generation board
                Board nextBoard = new Board(rows, cols, currentBoard.getTopology());

                for (int r = 0; r < rows; r++) {
                    for (int c = 0; c < cols; c++) {
                        int aliveCount = neighborLogic.countAliveNeighbors(currentBoard, r, c);
                        int nextState = rules.calculateNextState(currentBoard.getCells(r, c), aliveCount);
                        nextBoard.setCell(r, c, nextState);
                    }
                }

                currentBoard = nextBoard;
                Thread.sleep(delay * 100);
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}