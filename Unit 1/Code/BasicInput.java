import java.util.Scanner;

public class BasicInput
{
    public static void main(String[] args)
    {
        
        Scanner scannyBoi = new Scanner(System.in);
        
        System.out.print("Enter your useername: ");
        String userName = scannyBoi.nextLine();
        System.out.print("Enter your favorite class: ");
        String favClass = scannyBoi.nextLine();
        System.out.print("Enter your favorite war crime: ");
        String favWarCrime = scannyBoi.nextLine();
        System.out.println("Enter your age: ");
        int age = scannyBoi.nextInt();
        System.out.println("Hi, "+userName+". Your favorite class is "+favClass+", your favorite war crime is "+favWarCrime+", and you are "+age+" years old.");
        scannyBoi.close();
    }
}