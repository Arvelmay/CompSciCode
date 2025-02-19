import java.util.*;

public class RandClient {
    public static void main(String[] args) {
        MyRand newrandyboi = new MyRand();
        Random randyboi = new Random();

        int upBound = randyboi.nextInt(10)+11;
        int loBound = randyboi.nextInt(11);
        System.out.print("A random double between "+loBound+" and "+upBound+": ");
        System.out.println(newrandyboi.nextDouble(loBound,upBound));

        int size = randyboi.nextInt(21);
        upBound = randyboi.nextInt(10)+11;
        loBound = randyboi.nextInt(10)+1;
        System.out.print("A random int array with size "+size+" between "+loBound+" and "+upBound+": ");
        System.out.println(Arrays.toString(newrandyboi.intList(size, loBound, upBound)));

        
    }
}
