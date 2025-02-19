
import java.util.Random;

public class MyRand extends Random{
    public MyRand(){
        //We don't have any instance data ¯\_(ツ)_/¯
    }

    public double nextDouble(int a, int b){
        return super.nextDouble(b-a)+a;
    }

    public int[] intList(int s, int a, int b){
        int[] ints = new int[s];
        for(int i = 0; i<ints.length; i++){
            ints[i] = super.nextInt(b-a+1)+a;
        }
        return ints;
    }

    public String nextChoice(String[] s){
        return s[super.nextInt(s.length)];
    }

    public String[] subset(String[] s, int n){
        String[] outStrings = new String[n];
        for(String i: outStrings){
            i = s[super.nextInt(s.length)];
        }
        return outStrings;
    }

    public Object[] subset(Object[] o, int n){
        Object[] outObjects = new Object[n];
        for(Object i: outObjects){
            i = o[super.nextInt(o.length)];
        }
        return outObjects;
    }

    public char nextLetter(){
        String alph = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] alf = alph.toCharArray();
        return alf[super.nextInt(alf.length)];
    }

    public int nextSquare(int n){
        int out = 0;
        do { 
            out = super.nextInt(n+1);
        } while (Math.floor((double) out) != Math.sqrt((double) out));
        return out;
    }
}
