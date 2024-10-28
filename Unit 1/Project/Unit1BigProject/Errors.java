// Find all errors in the following program.
// Make sure the program will compile and run as intended.
// The purpose of the program is to obtain the names of two students and three of their test scores
// The program will then display each student's name, scores and true average (mean).
// Fixing this program requires you to make several changes, so please be thorough. 

import java.util.Scanner;


public class Errors
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        String name1, name2;
        double a, b, c;
        double x, y, z;
        double average1, average2;
        
        System.out.println("Enter the first name. ");
        name1 = reader.nextLine();
        System.out.println("Enter the second name. ");
        name2 = reader.nextLine();
        
        System.out.println("Enter the three scores for the first student.");
        a = reader.nextInt();
        b = reader.nextInt();
        c = reader.nextInt();
        
        System.out.println("Enter the three scores for the second student.");
        x = reader.nextInt();
        y = reader.nextInt();
        z = reader.nextInt();
        
        average1 = (a + b + c) / 3;
        average2 = (x + y + z) / 3;
        
        System.out.println("Here is the data.");
        
        System.out.println("\t"+name1+"\t\t"+name2);
        System.out.println("1.\t" + a + "\t\t" + x);
        System.out.println("2.\t" + b + "\t\t" + y);
        System.out.println("3.\t" + c + "\t\t" + z);
        System.out.println("Avg.\t" + average1 + "\t\t" + average2);
    }
}