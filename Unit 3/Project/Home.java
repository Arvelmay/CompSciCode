public class Home
{
    // instance variables
    private String address, city;
    private int zipCode, sqFeet;
    private double value;
    
    // user-defined constructor
    public Home(String add, String c, int zip, int sf, double v)
    {
        address = add;
        city = c;
        zipCode = zip;
        sqFeet = sf;
        value = v;
    }
    
    // accessor methods
    public String getAddress()
    {
        return this.address;
    }
    
    public String getCity()
    {
        return this.city;
    }
    
    public int getZip()
    {
        return this.zipCode;
    }
    
    public int getSF()
    {
        return this.sqFeet;
    }
    
    public double getValue()
    {
        return this.value;
    }
    
    // modifier methods
    public void updateSF( int sf )
    {
        this.sqFeet = sf;
    }
    
    public void updateValue(double v)
    {
        this.value = v;
    }
    
    public String toString()
    {
        String str = this.address + "\n" + this.city + " " + this.zipCode + "\n$" + this.value; 
        return str;
    }
    
    // our equals method will return true if two homes have the same value.
    public boolean equals (Home obj)
    {
        return this.value == obj.value;
    }
    
    // dp = down payment, r = annual rate as a decimal
    // n = number of total payments. Method will return monthly payment
    public double monthlyPay( double dp, double r, int n )
    {
        // find monthly interest
        double i = r/12;
        // find loan amount
        double loan = value - dp;
        double top = i * Math.pow( 1+i, n );
        double bottom = Math.pow(1+i, n) - 1;
        return loan * (top/bottom);
        
    }
    
    // find the value of the home after a given number of years
    // r = rate of increase, y = number of years
    public double appreciation( double r, int y )
    {
        return this.value * Math.pow( 1+r, y);
    }
    
    //this method returns the price per sq. ft.
    public double pricePerSq( )
    {
        return this.value / this.sqFeet;
    }
    
}