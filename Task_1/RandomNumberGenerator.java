import java.util.Random;

public class RandomNumberGenerator
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
        System.out.println("Random Number between " + min + " and " + max + ": " + randomNumber);
    }
}
