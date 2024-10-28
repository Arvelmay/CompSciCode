import java.util.Scanner;

public class ThursdayWarmup
{
    public static void main(String[] args)
    {
    
        Scanner scannyBoi = new Scanner(System.in);
        System.out.print("Enter the goofy: ");
        String userName = scannyBoi.nextLine();
        
        System.out.print("Enter how long have you existed on this mortal plane, in calendar years: ");
        int age = scannyBoi.nextInt();
        scannyBoi.nextLine();
        
        System.out.print("Also enter the color that you feel the fondest attraction to: ");
        String favColor = scannyBoi.nextLine();
        
        System.out.println("Hello, " + userName + " nice to meet you! You are "+age+" years old. You also like the color "+favColor+".");
        scannyBoi.close();
    }
}