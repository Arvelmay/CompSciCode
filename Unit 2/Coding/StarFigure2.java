import java.util.Scanner;

public class StarFigure2 {
    public static void main(String[] args)
    {
        Scanner scannyboi = new Scanner(System.in);
        System.out.println("Enter an int:");
        int lines = scannyboi.nextInt();
        String stars = "";
        String frontslash = "";
        String backslash = "";
        for (int i = lines; i>0; i--)
        {
            for(int ii = i; ii>1; ii--)
            {
                frontslash+="////";
                backslash+="\\\\\\\\";
            }

            System.out.println(frontslash+stars+backslash);
            stars=""; frontslash = ""; backslash = "";

            for (int ii = 0; ii<(lines-i+1)*2; ii++)
            {
                stars+="****";
            }
        }
        scannyboi.close();
    }
}
