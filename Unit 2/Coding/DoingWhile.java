import java.util.Scanner;

public class DoingWhile {
    public static void main(String[] args)
    {
        Scanner scannyboi = new Scanner(System.in);
        
        int pass = 12345;
        int userGuess;
        System.out.print("Enter you passwordy thing: ");
        do {
            userGuess = scannyboi.nextInt();
        } while (userGuess != pass);
        scannyboi.close();
    }
}
