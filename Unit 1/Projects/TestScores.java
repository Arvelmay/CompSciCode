import java.util.Scanner;
/**
 * Write a description of class TestScores here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestScores
{
    public static void main(String[] args)
    {
        
        Scanner scannyBoi = new Scanner(System.in);
        
        double goodPoints = 360.0;
        
        System.out.print("Enter your name: "); String userName = scannyBoi.nextLine();
        System.out.print("Enter Score 1: "); double score1 = (double) scannyBoi.nextInt(); scannyBoi.nextLine();
        System.out.print("Enter Score 2: "); double score2 = (double) scannyBoi.nextInt(); scannyBoi.nextLine();
        System.out.print("Enter Score 3: "); double score3 = (double) scannyBoi.nextInt(); scannyBoi.nextLine();
        
        double average = (score1+score2+score3)/3; double pointsLeft = goodPoints - score1-score2-score3;
        System.out.println(userName+"'s average score so far is "+average+", and you need an "+pointsLeft+" to get an a");
        scannyBoi.close();
    }
}
