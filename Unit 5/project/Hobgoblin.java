import java.util.Random;

public class Hobgoblin extends Monster {
    //Instance Vars, defaults: hp = 7; ap = 5; mp = 3; pp = 4
    private int pp;

    //Constructior
    //Default
    public Hobgoblin(){
        super();
        this.pp = 1;
    }

    //User Defined
    public Hobgoblin(int h, int a, int m, int p){
        super(h,a,m, "HG");
        Random randyboi = new Random();
        this.pp = p+randyboi.nextInt(2)-1;
    }


}
