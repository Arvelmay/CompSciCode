import java.util.Scanner;

public class WarmUp {
    public static void main(String[] args)
    {
        Scanner scannyboi = new Scanner(System.in);
        System.out.print("Enter an odd int between 21 and 31: ");
        int userNum = scannyboi.nextInt();
        scannyboi.nextLine();
        while(userNum%2==0 || userNum<21 || userNum>31)
        {
            System.out.print("Enter an ODD int BETWEEN 21 AND 31: ");
            userNum = scannyboi.nextInt();
            scannyboi.nextLine();
        }
        System.out.print("Enter your name: ");
        String userName = scannyboi.nextLine();
        System.out.print("Enter a negative number or a number greater than 100: ");
        userNum = scannyboi.nextInt();
        int i=0;
        while(userNum >= 0 && userNum <=100)
        {
            if (i!=2){
                System.out.print("Enter a NEGATIVE number or a number GREATER than 100: ");
                userNum = scannyboi.nextInt();
                scannyboi.nextLine();
            }
            else if (i==2)
            {
                System.out.println("Faliure.");
                break;
            }
            else{
                System.out.println("Hello "+userName);
                break;
            }
            i++;
        }
        scannyboi.close();
    }
}
