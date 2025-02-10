import java.util.Random;
/**
 * Write a description of class WarmningUP here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WarmningUP
{
    public static void main(String[] args){
        Random randyboi = new Random();
        
        double q1 = randyboi.nextDouble();
        double q2 = 2*Math.random();
        double q3 = randyboi.nextDouble()+1;
        int q4 = randyboi.nextInt(1706)-743;
        
        System.out.println("1) "+q1+"\n2) "+q2+"\n3) "+q3+"\n4) "+q4);
    }
}
