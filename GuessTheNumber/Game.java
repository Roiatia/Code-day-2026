package GuessTheNumber;
import java.util.Random;
public class Game {
    Random rand = new Random();
    private int numberToGuess;
     private int maxAttempts;


     public Game(int maxAttempts) {
         this.numberToGuess = rand.nextInt(100) + 1; // Random number between 1 and 100
         this.maxAttempts = maxAttempts;
     }

        public int getNumberToGuess() {
            return numberToGuess;
        }

        public int getMaxAttempts() {
            return maxAttempts;
        }


}
