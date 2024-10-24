import java.util.Scanner;
/**
 * Write a description of class WhilePractice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WhilePractice
{
    public static void main(String[] args)
    {
        Scanner scannyboi = new Scanner(System.in);
        System.out.println("please enter  number larger than 24");
        int userNum = scannyboi.nextInt();
        int tries = 1;
        while (userNum <= 24)
        {
            System.out.println("PLEASE enter a number larger than 24");
            userNum = scannyboi.nextInt();
            tries++;
        }
        
        System.out.print("You entered " + userNum+" and it took "+tries+" tr");
        
        if (tries < 2)
            System.out.println("y\nYou rule");
        else if (tries > 5)
            System.out.println("ies\nyou stupid");
        else
            System.out.println("ies");scannyboi.close();
    }
}
