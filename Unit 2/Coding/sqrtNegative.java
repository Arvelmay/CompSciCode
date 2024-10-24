import java.util.Scanner;
/**
 * Write a description of class sqrtNegative here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class sqrtNegative
{
    public static void main(String[] args){
        Scanner scannyBoi = new Scanner(System.in);
        System.out.print("Enter an int: ");
        int myNum = scannyBoi.nextInt();
        int absVal = Math.abs(myNum);
        double root = Math.sqrt(absVal);
        System.out.print("√" + myNum+" = "+root);
        if (myNum < 0){
            System.out.println("i");
        }scannyBoi.close();
    }
}
