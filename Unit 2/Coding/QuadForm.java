import java.util.Scanner;
/**
 * Write a description of class QuadForm here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

//(-b +- √b^2-4ac)2a

public class QuadForm
{
    public static void main(String[] args){
        Scanner scannyboi = new Scanner(System.in);
        System.out.println("Enter a, b, c for a quadratic equation: ");
        System.out.print("Enter a: ");
        int a = scannyboi.nextInt();
        System.out.print("Enter b: ");
        int b = scannyboi.nextInt();
        System.out.print("Enter c: ");
        int c = scannyboi.nextInt();
        System.out.print("Enter true for -b + √b^2-4ac or false for -b - √b^2-4ac: ");
        boolean xSwitch = scannyboi.nextBoolean();
        System.out.println(QuadForm.quadForm(a,b,c,xSwitch));scannyboi.close();
    }
    
    public static double quadForm(int a, int b, int c, boolean xSwitch){
        double x= (-1*b);
        if (xSwitch == true){
            x += Math.sqrt(b*b-4*a*c);
        }
        else{
            x -= Math.sqrt(b*b-4*a*c);
        }
        x /= 2*a;
        return x;
    }
}
