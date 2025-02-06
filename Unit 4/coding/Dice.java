import java.util.Random;
/**
 * Write a description of class Dice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dice
{
    public static int roll2 (){
        Random randyboi = new Random();
        return (randyboi.nextInt()+randyboi.nextInt());
    }
    
    public static int[] rollAgain (int times){
        int[] ints = new int[times];
        for (int i = 0; i < times; i++){
            ints[i] = roll2();
        }
        return ints;
    }
    
    public static void main(String[] args) {
        
    }
}
