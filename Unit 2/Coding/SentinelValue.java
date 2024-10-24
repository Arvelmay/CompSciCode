import java.util.Scanner;
/**
 * Write a description of class SentinelValue here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SentinelValue
{
    public static void main(String[] args)
    {
        Scanner scannyboi = new Scanner(System.in);
        
        System.out.println("Enter a positive number and I'll print stars!");
        System.out.println("Enter -1 to quit");
        System.out.println("Enter anything else to continue");
        int userNum = scannyboi.nextInt();
        while (userNum != -1)
        {
            if (userNum>0)
            {
                for (int i =0; i< userNum; i++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println("Next? (-1 to quit)");
            userNum = scannyboi.nextInt();
        }scannyboi.close();
    }
}
