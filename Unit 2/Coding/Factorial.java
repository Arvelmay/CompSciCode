import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner scannyboi = new Scanner(System.in);
        System.out.print("Enter a number to factorial:\t");
        int n = scannyboi.nextInt();
        int tempN = n-1;
        int factorialThing = n;
        if (n == 0)
            factorialThing = 1;
        while (tempN > 0)
        {
            factorialThing *= tempN;
            tempN--;
        }
        System.out.println(n+"! = "+factorialThing);scannyboi.close();
    }
}
