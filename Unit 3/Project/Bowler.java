public class Bowler
{
    // instance variables
    private String name;
    private double average;
    private int g1, g2, g3;
   
    private static int count = 0;
   
    // user defined constructor
    public Bowler ( String n, int x, int y, int z )
    {
        this.name = n;
        this.g1 = x;
        this.g2 = y;
        this.g3 = z;
        this.average = ((double) x+y+z)/3;
        count++;
    }
   
    // accessor methods
   
    public double getAverage()
    {
        return this.average;
    }
    public String getName()
    {
        return this.name;
    }
    public int getGame(int gameNum)
    {
        switch (gameNum){
            case 1: return this.g1;
            case 2: return this.g2;
            case 3: return this.g3;
            default: return 0;
        }
    }
       
    // modifier methods
    public void changeGame ( int gameNum, int newScore )
    {
        switch (gameNum){
            case 1: this.g1 = newScore;
            break;
            case 2: this.g2 = newScore;
            break;
            case 3: this.g3 = newScore;
            break;
        }

        this.average = ((double) this.g1 + this.g2 + this.g3)/3;
    }
   

   
    public void changeName( String n )
    {
        this.name = n;
    }
   
   
    // this method will return the series total
    public int findSeries ()
    {
        return this.g1+this.g2+this.g3;
    }

   
    // this method will return the high game
    public int highGame ()
    {
        if (this.g1>this.g2&&this.g1>this.g3){
            return this.g1;
        }
        else if (this.g2>this.g1&&this.g2>this.g3){
            return this.g1;
        }
        else if (this.g3>this.g1&&this.g3>this.g2){
            return this.g1;
        }
        else if (this.g1 == this.g2 || this.g1 == this.g3){
            return this.g1;
        }
        else if (this.g2 == this.g3){
            return this.g2;
        }
        else{
            return 0;
        }
    }
   
    public String toString ()
    {
        String str = name + "\t" + average + "\n" + g1 + "\n" + g2 + "\n" + g3;
        return str;
    }
   
   
   
}