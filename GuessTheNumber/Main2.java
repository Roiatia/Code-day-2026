package GuessTheNumber;
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            Game2 game = new Game2(1, 100, 10);

            System.out.println("Welcome to Guess The Number!");
            System.out.println("You have " + game.getMaxAttempts()
                    + " attempts to guess the number between "
                    + game.getMin() + " and " + game.getMax() + ".");

            while (!game.isGameOver()) {

                System.out.print("Attempt " + game.getCurrentAttempt()
                        + ": Enter your guess: ");

                if (!scanner.hasNextInt()) {
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.next();
                    continue;
                }

                int guess = scanner.nextInt();
                Game2.GuessResult result = game.makeGuess(guess);

                switch (result) {
                    case TOO_LOW:
                        System.out.println("Too low!");
                        break;
                    case TOO_HIGH:
                        System.out.println("Too high!");
                        break;
                    case CORRECT:
                        System.out.println("Congratulations! You guessed the number!");
                        break;
                    case OUT_OF_RANGE:
                        System.out.println("Please enter a number within the allowed range.");
                        break;
                }
            }

            if (!game.isGuessedCorrectly()) {
                System.out.println("Sorry, you lost. The correct number was "
                        + game.getNumberToGuess());
            }
        }
    }
}
