public class Rectangle{
	
	//Instance Variables
		//What are the things that define a rectangle? 
	private double length;
	private double width;
	//Note: There could be more, like location on a grid.
	
	
	//Constructors
		//When the client makes a particular rectangle, how is that done?
	
	//Default Constructor (takes no information)
	public Rectangle(){
		this.length = 1;
		this.width = 1;
	}//Sets length and width to 1 because we have no more info
	
	
	//User-Specified Constructor (takes info)
	public Rectangle(double len, double wid){
		this.length = len;
		this.width = wid;
	}//Sets length and width to what is plugged in.
	
	//There will be one more type of constructor later
	
	
	//Methods
	
	//'Getter' Method
	public double getLength(){
		return this.length;
	}//Include if you want the client to retrieve Length
	
	//'Setter' Method
	public void setLength(double newLen){
		this.length = newLen;
	}//Include if you want the client to change Length
	
	//TODO: Finish getWidth() and setWidth()
	//visibility returnType getWidth()
	
	
	
	
	//visibility returnType setWidth()
	
	
	
	
	public double area(){
		return this.length * this.width;
	}
	//TODO: Finish perimeter method
	//visibility returnType perimter()
	
		
	
	public boolean isSquare(){
		return this.length==this.width;
	}//A rectangle is a square if length and width are the same.
	
	public double diagonal(){
		double l = this.length;
		double w = this.width;
		return Math.sqrt(l*l+w*w);
	}//Extra lines to make last line easier to read.
}