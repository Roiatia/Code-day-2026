package GuessTheNumber;
import java.util.Random;
public class Game2 {

    public enum GuessResult {
        TOO_LOW,
        TOO_HIGH,
        CORRECT,
        OUT_OF_RANGE

     }
    private final int min;
    private final int max;
    private final int maxAttempts;
    private final int numberToGuess;

    private int attemptsUsed;
    private boolean guessedCorrectly;

    public Game2(int min, int max, int maxAttempts) {
        if (min >= max || maxAttempts <= 0) {
            throw new IllegalArgumentException("Invalid game configuration");
        }

        this.min = min;
        this.max = max;
        this.maxAttempts = maxAttempts;
        this.numberToGuess = new Random().nextInt(max - min + 1) + min;
        this.attemptsUsed = 0;
        this.guessedCorrectly = false;
    }

    public GuessResult makeGuess(int guess) {

        if (guess < min || guess > max) {
            return GuessResult.OUT_OF_RANGE;
        }

        attemptsUsed++;

        if (guess == numberToGuess) {
            guessedCorrectly = true;
            return GuessResult.CORRECT;
        }

        return (guess < numberToGuess)
                ? GuessResult.TOO_LOW
                : GuessResult.TOO_HIGH;
    }

    public boolean isGameOver() {
        return guessedCorrectly || attemptsUsed >= maxAttempts;
    }

    public boolean isGuessedCorrectly() {
        return guessedCorrectly;
    }

    public int getCurrentAttempt() {
        return attemptsUsed + 1;
    }

    public int getMaxAttempts() {
        return maxAttempts;
    }

    public int getNumberToGuess() {
        return numberToGuess;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }
}
