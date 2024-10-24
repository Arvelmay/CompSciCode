import java.util.Scanner;
/**
 * Write a description of class Unit2GradedExcercis here.
 *
 * @author alfonso
 * @version 1.0
 */
public class Unit2GradedExcercise1
{
    public static void main(String[] args)
    {
        Scanner scannyboi = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 9");
        int userNum = scannyboi.nextInt();
        String temp = "";
        while (userNum <1 || userNum >9)
        {
            System.out.print("Not a good number >:(\nEnter a number from 1 to 9: ");
            userNum = scannyboi.nextInt();
        }
        for (int i=1; i<=userNum; i++)
        {
            temp+="*";
            System.out.println(temp);
        }
        System.out.println("\n");
        temp = "";
        String spaceTemp = "";
        for (int i = 1; i<=userNum; i++)
        {
            temp="";
            spaceTemp="";
            for (int ii = 1; ii<=(userNum-i); ii++){
                spaceTemp+=" ";
            }
            for (int ii = 1; ii<=(i); ii++)
            {
                temp+=i;
            }
            System.out.println(spaceTemp+temp);
        }
    scannyboi.close();
    }
}
