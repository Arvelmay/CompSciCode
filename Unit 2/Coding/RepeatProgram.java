import java.util.Scanner;
import AlfonsosMethods.AMath;

public class RepeatProgram {
    public static void main(String[] args)
    {
        Scanner scannyboi = new Scanner(System.in);

        System.out.println("This program finds factorial for non-negative ints");
        System.out.println("Enter an int to to start or a negative to quit");

        int userEntry = scannyboi.nextInt();

        while (userEntry >=0);
        {
            System.out.print(userEntry + "! = ");
            System.out.println(AMath.factorial(userEntry));
            userEntry = scannyboi.nextInt();
        }
        System.out.println("Thanks for playing");
        System.out.println("Make sure to leave a * * * * * reveiw on Yelp!");scannyboi.close();
    }
}
