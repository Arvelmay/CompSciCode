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
    
    public static String anyRoot(int n){
        int absVal = Math.abs(n);
        double root = Math.sqrt(absVal);
        String ans = "√"+n+" = "+root;
        if (n < 0){
            ans += "i";
        }
        return ans;
    }
    
    public static int factorial(int n){
        int tempN = n-1;
        int factorialThing = n;
        if (n == 0){
            tempN = 0; factorialThing = 1;}
        
        while (tempN != 0)
        {
            factorialThing *= tempN;
            tempN--;
        }
        return factorialThing;
    }
}
