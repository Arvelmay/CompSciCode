import java.util.Scanner;

public class PassMatch
{
    public static void main(String[] args)
    {
        Scanner scannyboi = new Scanner(System.in);
        int pass = 12345;
        System.out.print("Enter you password:\t");
        int userIn = scannyboi.nextInt();
        while (userIn != pass)
        {
            System.out.print("WRONG YOU FAILURE!!!\n\nTry again please:\t");
            userIn = scannyboi.nextInt();
        }
        System.out.println("\ngood.");scannyboi.close();
    }
}