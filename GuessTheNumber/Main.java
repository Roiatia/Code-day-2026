package GuessTheNumber;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        Game game = new Game(10); // Create a game with a maximum of 10 attempts
        System.out.println("Welcome to Guess The Number!");
        System.out.println("You have " + game.getMaxAttempts() + " attempts to guess the number between 1 and 100.");

        for (int attempt = 1; attempt <= game.getMaxAttempts(); attempt++) {
            System.out.print("Attempt " + attempt + ": Enter your guess: ");
            int userGuess = scanner.nextInt();

            if (userGuess < 1 || userGuess > 100) {
                System.out.println("Please enter a number between 1 and 100.");
                attempt--; // Do not count this as an attempt
                continue;
            }

            if (userGuess == game.getNumberToGuess()) {
                System.out.println("Congratulations! You've guessed the number " + game.getNumberToGuess() + " correctly!");
                break;
            } else if (userGuess < game.getNumberToGuess()) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }

            if (attempt == game.getMaxAttempts()) {
                System.out.println("Sorry, you've used all your attempts. The correct number was " + game.getNumberToGuess() + ".");
            }
        }
        scanner.close();

    }
}
