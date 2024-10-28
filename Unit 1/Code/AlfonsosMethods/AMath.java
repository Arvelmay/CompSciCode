package AlfonsosMethods;


/**
 * Write a description of class AlfonsoMath here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AMath
{
    public static double pythagorus(double a, double b){
        return Math.sqrt((a*a)+(b*b));
    }
    
    public static String convertSecs(int secs){
        int minutes = secs/60;
        int newSecs = secs%60;
        return secs+" seconds is "+minutes+" minutes and "+newSecs+" seconds";
    }
}
