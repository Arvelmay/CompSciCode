import java.util.Scanner;

public class PIApprox
{
    public static double gottPI(int digits)
    {
        double temp = 1;
        double alsoTemp = 1;
        double addTo = 0;
        for (int i = 1; i<=digits; i++)
        {
            temp = 4*(1.0/alsoTemp);
            if (i%2 == 0)
                addTo-= temp;
            else{
                addTo+=temp;}
            alsoTemp+=2;
        }
        return addTo;
    }

    public static void main(String[] args)
    {
        Scanner scannyboi = new Scanner(System.in);
        System.out.println(gottPI(scannyboi.nextInt()));
        scannyboi.close();
    }
}