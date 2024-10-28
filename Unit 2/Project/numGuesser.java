import java.util.*;

public class numGuesser {
    public static void main(String[] args)
    {
        Scanner scannyboi = new Scanner(System.in);
        Random randyboi = new Random();
        String playAgain;
        do {
            int secretNum = randyboi.nextInt(100);
            System.out.println("The secret number is: " + secretNum);
            int guess;
            int guesses = 0;
            int max = 100;
            int min = 1;
            do {
                System.out.print("Enter a number between " +min+ " and " +max+ ": ");
                guess = scannyboi.nextInt();
                scannyboi.nextLine();
                if (guess > secretNum && guess < max) {
                    System.out.println("You entered " + guess + " which is too high.");
                    max = guess-1;
                }
                else if (guess < secretNum && guess > min) {
                    System.out.println("You entered " + guess + " which is too low.");
                    min = guess+1;
                }
                else if (guess < min || guess > max) {
                    System.out.println("You entered " + guess + " which is invalid.");
                }
                guesses++;
            } while (guess != secretNum);
            System.out.println("Congrats, the secret number was " + secretNum + "! It took you " + guesses + " tries.");
            System.out.print("Play again? (y/n): ");
            playAgain = scannyboi.nextLine();
        } while(!playAgain.equals("n"));
        System.out.println("Shutting down.");
        scannyboi.close();
    }
}
