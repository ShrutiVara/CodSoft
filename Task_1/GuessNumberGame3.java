import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame3 
{
    public static void main(String[] args)
    {
        // Define the range
        int min = 1;
        int max = 100;
        
        // Create an instance of Random class
        Random random = new Random();
        
        // Generate random number within the range [min, max]
        int randomNumber = random.nextInt((max - min) + 1) + min;
        
        // Create an instance of Scanner class for user input
        Scanner scanner = new Scanner(System.in);
        
        int userGuess = 0;
        boolean guessedCorrectly = false;
        
        // Loop until the user guesses the correct number
        while (!guessedCorrectly) {
            // Prompt the user to enter their guess
            System.out.print("Enter your guess (between " + min + " and " + max + "): ");
            userGuess = scanner.nextInt();
            
            // Check the user's guess
            if (userGuess < min || userGuess > max) {
                System.out.println("Please enter a number within the specified range.");
            } else if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number: " + randomNumber);
                guessedCorrectly = true;
            }
        }
        
        // Close the scanner
        scanner.close();
    }
}
