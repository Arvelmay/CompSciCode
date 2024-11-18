public class Cylinder
{
    //Instance Variables
    
    private double radius;
    private double height;
    
    //Static Variables
    //None
    
    //Constructors
    
    //Default Constructor
    public Cylinder(){
        this.radius = 1;
        this.height = 1;}
        
    //User-Defined Constructor
    public Cylinder(double r, double h){
        this.radius = r;
        this.height = h;}
    
    //Copy Constructor
    public Cylinder(Cylinder c2){
        this.radius = c2.radius;
        this.height = c2.height;}
        
    //Getters
    public double getRadius(){
        return this.radius;}
    
    public double getHeight(){
        return this.height;}
        
    public double getDiameter(){
        return 2*this.radius;}
        
    //Setters
    //None. I don't want the user to be able to 
    //make changes to a cylinder
    
    public double volume(){
        double base = Math.PI*this.radius*this.radius;
        return base*this.height;
    }
    
    public double surfaceArea(){
        double base = Math.PI*this.radius*this.radius;
        double circumference = Math.PI * 2 * this.radius;
        double lateralArea = this.height*circumference;
        return 2*base+lateralArea;
        }
    //toString()
    //What should we display if we print our object?
    public String toString(){
        String output = "Cylinder Stats:";
        output += "\nRadius: "+this.radius+"\tHeight: "+this.height;
        output += "\nVolume: "+this.volume();
        output += "\nSurface Area: " +this.surfaceArea();
        return output;    
    }
    
    public static void main(String[] args){
    
        Cylinder c1 = new Cylinder(5,10);
        System.out.println(c1);
    
    }
}
