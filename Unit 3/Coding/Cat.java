
public class Cat
{
    //Instance Variables
    //CAT FACTS!
    private String color;
    private int age;
    private String name;
    private double weight;
    
    
    //Constructors
    //The purpose of a constructor is to set the inital value for the instance variables.
    
    //Default constructor (or no-arg or no-param)
    //Create default cat with no info provided.
    public Cat(){
        this.color = "unknown color";
        this.age = 5;
        this.name = "unknown name";
        this.weight = 10;
    }
    //User-defined constructor
    public Cat(String col, int ag, String nm, double wt){
        this.color = col;
        this.age = ag;
        this.name = nm;
        this.weight = wt;
    }
    
    public void meow(){
        System.out.println(this.name+": 'MEOW'");}
    
}









