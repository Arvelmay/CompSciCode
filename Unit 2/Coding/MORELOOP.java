import java.util.Scanner;
/**
 * Write a description of class M here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MORELOOP
{
    public static void main(String[] args)
    {
        Scanner scannyboi = new Scanner(System.in);
        
        System.out.println("Enter a high and a low int:");
        int low = scannyboi.nextInt();
        int high = scannyboi.nextInt();
        for (int i = low; i<high; i++){
            System.out.println(i);
        }
        
        for (int i = 0; i<125; i = i+5){
            System.out.print(i+" ");
        }scannyboi.close();
    }
}
