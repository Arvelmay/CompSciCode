
public class Increments
{
    /*
     * This class works on increment/decrement operators
     * like total-- and age++
     * There're separate PREfix increment/decrement
     * operators that AREN'T ON THE AP
     */
    public static void main(String[] args){
        
        int total = 12;
        System.out.println(total);
        total++;
        System.out.println(total);
        System.out.println(total--);
        System.out.println(total);
        
        int myNum = 55;
        myNum++;
        System.out.println(myNum++);
        System.out.print(myNum++);
        System.out.print(myNum);
        myNum++;
    }
}