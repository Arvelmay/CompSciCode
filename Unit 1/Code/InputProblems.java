import java.util.Scanner;


public class InputProblems
{
    public static void main(String[] args)
    {
        Scanner scannyBoi = new Scanner(System.in);
        System.out.print("Item Name: ");
        String itemName = scannyBoi.nextLine();
        System.out.print("Item Cost: ");
        double itemCost = scannyBoi.nextDouble();
        scannyBoi.nextLine();
        System.out.print("Item weight: ");
        double itemWeight = scannyBoi.nextDouble();
        scannyBoi.nextLine();
        System.out.print(itemName+" costs $"+itemCost+" and wieghs "+itemWeight+"lbs.");
        scannyBoi.close();
    }
}