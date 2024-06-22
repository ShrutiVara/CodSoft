import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame2
{
    public static void main(String args[]) 
    {
        // Define the range
        int min = 1;
        int max = 100;
        
        // Create an instance of Random class
        Random random = new Random();
        
        // Generate random number within the range [min, max]
        int randomNumber = random.nextInt((max - min) + 1) + min;
        Scanner scanner = new Scanner(System.in);
        
        int userGuess = 0;
        boolean guessedCorrectly = false;
        while (!guessedCorrectly) 
	{
            System.out.print("Enter your guess (between " + min + " and " + max + "): ");
            userGuess = scanner.nextInt();

            if (userGuess < min || userGuess > max)
            {
                System.out.println("Please enter a number within the specified range.");
            }
	   else if (userGuess < randomNumber) 
	    {
                System.out.println("Too low! Try again.");
            } 
	   else if (userGuess > randomNumber) 
	    {
                System.out.println("Too high! Try again.");
            } 
           else
	   {
                System.out.println("Congratulations! You guessed the correct number: " + randomNumber);
                guessedCorrectly = true;
            }
        }
        
        scanner.close();
    }
}
