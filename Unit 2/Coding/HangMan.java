import java.util.Scanner;

public class HangMan
{
    public static void main(String[] args)
    {
        Scanner scannyboi = new Scanner(System.in);

        int guessesLeft = 6;

        String secretWord = "Globular";

        for (int i=0; i<secretWord.length(); i++){
            System.out.print("_  ");}
        
        System.out.println();
        System.out.println("You hava"+guessesLeft+" remaining guesses");
        while (guessesLeft > 0){
            System.out.println("Your guess?");
        }scannyboi.close();
    }
}