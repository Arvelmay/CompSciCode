import java.util.*;

public class RandClient {
    public static void main(String[] args) {
        MyRand newrandyboi = new MyRand();
        Random randyboi = new Random();

        int upBound = randyboi.nextInt(10)+11;
        int loBound = randyboi.nextInt(10)+1;
        System.out.print("A random double between "+loBound+" and "+upBound+": ");
        System.out.println(newrandyboi.nextDouble(loBound,upBound));

        int size = randyboi.nextInt(21)+1;
        upBound = randyboi.nextInt(10)+11;
        loBound = randyboi.nextInt(10)+1;
        System.out.print("A random int array with size "+size+" between "+loBound+" and "+upBound+": ");
        System.out.println(Arrays.toString(newrandyboi.intList(size, loBound, upBound)));

        String[] strings = new String[]{"Apple", "Banana", "Athens", "Sparta", "Troy", "Ac-130", "Satisfactory"};
        System.out.print("A random choice from "+Arrays.toString(strings)+": ");
        System.out.println(newrandyboi.nextChoice(strings));

        size = randyboi.nextInt(10)+1;
        System.out.print("A String[] with random choices from "+Arrays.toString(strings)+" of size "+size+": ");
        System.out.println(Arrays.toString(newrandyboi.subset(strings, size)));

        size = randyboi.nextInt(10)+1;
        Object[] objs = new Object[]{randyboi, newrandyboi};
        System.out.print("A Object[] with random choices from "+Arrays.toString(objs)+" of size "+size+": ");
        System.out.println(Arrays.toString(newrandyboi.subset(objs, size)));

        System.out.print("A random letter, upper or lower case: ");
        System.out.println(newrandyboi.nextLetter());

        size = randyboi.nextInt(50)+51;
        System.out.print("A random perfect square between 0 and "+size+": ");
        System.out.println(newrandyboi.nextSquare(size));
    }
}
