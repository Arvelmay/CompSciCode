
/**
 * Write a description of class TimeConvert here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Convert
{
    public static void main(String[] args){
        Convert.convertSec();
        Convert.convertTime();
        Convert.convertInch();
    }
    
    public static void convertSec(){
        //1234567 secs is 2 weeks 0 days 6 hours 56 mins and 7 secs
        Scanner scannyBoi = new Scanner(System.in);
        System.out.print("Enter an amount of seconds: ");
        int userSecs = scannyBoi.nextInt();
        int week = userSecs/604800;
        int days = userSecs%604800/86400;
        int hour = userSecs%604800%86400/3600;
        int mins = userSecs%604800%86400%3600/60;
        int secs = userSecs%604800%86400%3600%60;
        scannyBoi.nextLine();
        System.out.println(userSecs + " is " + week + " weeks, " + days + " days, " + hour + " hours, " + mins + " minutes, and " + secs + " seconds.");
    }
    
    public static void convertTime(){
        Scanner scannyBoi = new Scanner(System.in);
        System.out.print("Enter weeks: ");
        int week = scannyBoi.nextInt();
        System.out.print("Enter days: ");
        int days = scannyBoi.nextInt();
        System.out.print("Enter hours: ");
        int hour = scannyBoi.nextInt();
        System.out.print("Enter minutes: ");
        int mins = scannyBoi.nextInt();
        System.out.print("Enter seconds: ");
        int secs = scannyBoi.nextInt();
        int finalTime =  week*604800+days*86400+hour*3600+mins*60+secs;
        System.out.println(week+" weeks, "+days+" days, "+hour+" hours, "+mins+" minutes, and "+secs+" seconds is "+finalTime);
    }
    
    public static void convertInch(){
        // 2 5/16" is 37/16" and 5.87375cm
        Scanner scannyBoi = new Scanner(System.in);
        System.out.println("Enter a mixed fraction as X Y/Z: ");
        System.out.print("X: ");
        double x = scannyBoi.nextInt();
        System.out.print("Y: ");
        double y = scannyBoi.nextInt();
        System.out.print("Z: ");
        double z = scannyBoi.nextInt();
        double y2 = x*z+y;
        double cm = (y2/z)*2.54;
        System.out.print(x+" + "+y+"/"+z+"in = "+y2+"/"+z+"in = "+cm+"cm");
    }
}
