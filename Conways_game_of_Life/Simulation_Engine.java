package Conways_game_of_Life;
import java.util.Scanner;
import java.io.File;

public class Simulation_Engine {
       public static void main(String[] args) {
            try {
                // Loading initial pattern from file
                Scanner input = new Scanner(System.in);
                System.out.println("Enter file name/path:");
                String path = input.nextLine();
                Scanner fileScanner = new Scanner(new File(path));

                // Read board dimensions and delay from file
                int cols = fileScanner.nextInt();
                int rows = fileScanner.nextInt();
                int delay = fileScanner.nextInt(); // Delay in tenths of a second

                Board currentBoard = new Board(rows, cols);
                for (int i = 0; i < rows; i++) {
                    String line = fileScanner.next();
                    for (int j = 0; j < cols; j++) {
                        currentBoard.setCell(i, j, line.charAt(j) - '0');
                    }
                }
                fileScanner.close();

                // Initialize components
                Neighborhood_Logic neighborLogic = new Neighborhood_Logic();
                Rules rules = new Rules();
                Display_Engine display = new Display_Engine();

                // Main Simulation Loop
                while (true) {
                    display.printBoard(currentBoard); // Display board

                    // Calculate NEW generation on a separate board
                    Board nextBoard = new Board(rows, cols);

                    for (int r = 0; r < rows; r++) {
                        for (int c = 0; c < cols; c++) {
                            int aliveCount = neighborLogic.countAliveNeighbors(currentBoard, r, c);
                            int nextState = rules.calculateNextState(currentBoard.getCells(r, c), aliveCount);
                            nextBoard.setCell(r, c, nextState);
                        }
                    }

                    currentBoard = nextBoard; // Move to next generation
                    Thread.sleep(delay * 100); // Control progression speed
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                // Close System.in scanner if it was opened
                input.close();
            }
        }
    }
