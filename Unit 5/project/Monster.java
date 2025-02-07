import java.util.Random;

public class Monster {
    private int hp; //health points
    private int ap; //Attack points
    private int mp; //Magic  points

    private String vis;

    //constructors
    //default
    public Monster(){
        this.hp = 1;
        this.ap = 1;
        this.mp = 1;
        this.vis = "M_";
    }

    //user-defined
    public Monster(int h, int a, int m, String v){
        Random randyboi = new Random();
        this.hp = h+randyboi.nextInt(2)-1;
        this.ap = a+randyboi.nextInt(2)-1;
        this.mp = m+randyboi.nextInt(2)-1;
        this.vis = v;
    }

    public void hurt(int aAmount){
        this.hp-= aAmount;
    }

    public int attack(){
        return ap;
    }
}
