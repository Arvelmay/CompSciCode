import java.util.*;

public class Player extends Cell {
    //hp = 50, ap = 2-6, mp = 1-3
    static Scanner scannyboi = new Scanner(System.in);


    public Player(){
        super(50, "PL");
    }

    public Player(int h, int a, int m){
        super(h,a,m);
    }
}
