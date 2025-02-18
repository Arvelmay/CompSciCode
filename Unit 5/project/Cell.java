import java.util.Random;

public class Cell {
    private int hp; //health points
    private int ap; //Attack points
    private int ar; //Armor points
    private int mp; //Magic points

    private String vis;
    private boolean hasMagic;
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
    public Cell(int h, int a, int m, String v){
        Random randyboi = new Random();
        this.hp = h+randyboi.nextInt(2)-1;
        this.ap = a+randyboi.nextInt(2)-1;
        this.mp = m+randyboi.nextInt(2)-1;
        this.vis = v;
        this.isVisable = false;
        this.isMonster = true;
    }
    
    public Cell(int h, int a, int ar, String v, char e){
        Random randyboi = new Random();
        this.hp = h+randyboi.nextInt(2)-1;
        this.ap = a+randyboi.nextInt(2)-1;
        this.mp = ar+randyboi.nextInt(2)-1;
        this.vis = v;
        this.isVisable = false;
        this.isMonster = true;
    }

    
    public Cell(String v){
        this.isMonster = false;
        this.isVisable = false;
        this.vis = v;
    }

    public void hurt(int aAmount){
        this.hp-= aAmount-this.ar;
    }

    public void attack(Cell foe){
        if (this.hasMagic){
            if(Math.random() <= 0.25){
                foe.hurt((int) Math.random()*3);
            }
        }
    }

    public boolean isVisisble(){
        return this.isVisable;
    }

    public String getVis(){
        return this.vis;
    }
}
