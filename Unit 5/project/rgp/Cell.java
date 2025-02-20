import java.util.*;

public class Cell {
    private int hp; //health points
    private int ap; //Attack points
    private int ar; //Armor points
    private int mp; //Magic points

    private String vis;
    private boolean hasMagic;
    private boolean isVisable;
    private boolean isMonster;

    static Scanner scannyboi = new Scanner(System.in);
    static Random randyboi = new Random();

    //constructors
    //default
    public Cell(){
        this.isMonster = false;
        this.isVisable = false;
        this.vis = "[]";
    }

    //user-defined
    public Cell(int h, int a, int m, String v){
        this.hp = h+randyboi.nextInt(2)-1;
        this.ap = a+randyboi.nextInt(2)-1;
        this.mp = m+randyboi.nextInt(2)-1;
        this.ar = 0;
        this.vis = v;
        this.isVisable = false;
        this.isMonster = true;
    }
    
    public Cell(int h, int a, int ar, String v, char e){
        this.hp = h+randyboi.nextInt(2)-1;
        this.ap = a+randyboi.nextInt(2)-1;
        this.ar = ar+randyboi.nextInt(2)-1;
        this.mp = 0;
        this.vis = v;
        this.isVisable = false;
        this.isMonster = true;
    }

    public Cell(int h, String v){
        this.hp = h;
        this.ap = randyboi.nextInt(4)+2;
        this.mp = randyboi.nextInt(2);
        this.isVisable = false;
        this.isMonster = false;
    }

    public Cell(int h, int a, int m){
        this.hp = h;
        this.ap = a;
        this.mp = m;
        this.vis = "PL";
        this.isVisable = true;
    }

    
    public Cell(String v){
        this.isMonster = false;
        this.isVisable = false;
        this.vis = v;
    }

    public void hurt(int aAmount){
        this.hp -= aAmount-this.ar;
    }

    public void attack(Cell foe){
        if (this.hasMagic){
            if(Math.random() <= 0.25){
                foe.hurt(this.mp + (int) Math.random()*3);
            }
            else{
                foe.hurt(this.ap);
            }
        }
    }

    public boolean isVisisble(){
        return this.isVisable;
    }

    public boolean isMonster(){
        return this.isMonster;
    }

    public void setVisable(boolean v){
        this.isVisable = v;
    }

    public String getVis(){
        return this.vis;
    }

    public int getHealth(){
        return this.hp;
    }

    public int getAttack(){
        return this.ap;
    }

    public int getMagic(){
        return this.mp;
    }

    public int[] move(){
        System.out.print("Would you like to move N(north), E(east), S(south), W(west): ");
        String userInput = scannyboi.nextLine();
        switch(userInput.toLowerCase()){
            case "N": return new int[]{0,1};
            case "E": return new int[]{1,0}; 
            case "S": return new int[]{0,-1};
            case "W": return new int[]{-1,0};
            default: System.out.println("Error reading your move, no movement");
            return new int[]{0,0};
        }
    }
}
