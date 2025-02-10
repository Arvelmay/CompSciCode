import java.util.Random;

public class Cell {
    private int hp; //health points
    private int ap; //Attack points
    private int am; //armor points
    private int mp; //Magic  points

    private String vis;
    private boolean isVisable;
    private boolean isMonster;

    //constructors
    //default
    public Cell(){
        this.isMonster = false;
        this.isVisable = false;
        this.vis = "[]";
    }

    //user-defined
    //hp, ap, mp
    public Cell(int h, int a, int m, String v){
        Random randyboi = new Random();
        this.hp = h+randyboi.nextInt(2)-1;
        this.ap = a+randyboi.nextInt(2)-1;
        this.mp = m+randyboi.nextInt(2)-1;
        this.vis = v;
        this.isVisable = true;
        this.isMonster = true;
    }

    //I have the char to seperate this constructor from the one with magic
    public Cell(int h, int a, int am, String v, char e){
        Random randyboi = new Random();
        this.hp = h+randyboi.nextInt(2)-1;
        this.ap = a+randyboi.nextInt(2)-1;
        this.am = am+randyboi.nextInt(2)-1;
        this.vis = v;
        this.isVisable = true;
        this.isMonster = true;
    }

    
    public Cell(String v){
        this.isMonster = false;
        this.isVisable = true;
        this.vis = v;
    }

    public void hurt(int aAmount){
        this.hp-= aAmount;
    }

    public void attack(Cell foe){
        foe.hurt(this.ap);
    }

    public boolean isVisisble(){
        return this.isVisable;
    }

    public String getVis(){
        return this.vis;
    }
}
