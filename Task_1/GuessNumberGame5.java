import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame5 {
    public static void main(String[] args) {
        // Define the range
        int min = 1;
        int max = 100;
        
        // Define the number of attempts
        int maxAttempts = 10;
        
        // Create an instance of Random class
        Random random = new Random();
        
        // Generate random number within the range [min, max]
        int randomNumber = random.nextInt((max - min) + 1) + min;
        
        // Create an instance of Scanner class for user input
        Scanner scanner = new Scanner(System.in);
        
        int userGuess = 0;
        boolean guessedCorrectly = false;
        int attempts = 0;
        
        // Loop until the user guesses the correct number or runs out of attempts
        while (attempts < maxAttempts && !guessedCorrectly) {
            // Prompt the user to enter their guess
            System.out.print("Enter your guess (between " + min + " and " + max + "): ");
            userGuess = scanner.nextInt();
            
            // Increment the attempt counter
            attempts++;
            
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
            
            // Provide feedback on the number of remaining attempts
            if (!guessedCorrectly) {
                System.out.println("You have " + (maxAttempts - attempts) + " attempts left.");
            }
        }
        
        // If the user runs out of attempts, reveal the correct number
        if (!guessedCorrectly) {
            System.out.println("Sorry, you've run out of attempts. The correct number was: " + randomNumber);
        }
        
        // Close the scanner
        scanner.close();
    }
}
