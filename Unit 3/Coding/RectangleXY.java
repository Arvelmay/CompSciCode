import javax.swing.*;

public class RectangleXY
{
    private double length;
    private double width;
    private int x1;
    private int y1;
    //(x1,y1) represents the top-left corner of the rectangle
    
    
    public RectangleXY(){
        this.length = 1;
        this.width = 1;
        this.x1 = 0;
        this.y1 = 0;}
        
    public RectangleXY(double len, double wid){
        this.length = len;
        this.width = wid;
        this.x1 = 0;
        this.y1 = 0;}
        
    public RectangleXY(double len, double wid, int x, int y){
        this.length = len;
        this.width = wid;
        this.x1 = x;
        this.y1 = y;}
    
    //TODO: Write getLength(), getWidth(), getX1(), getY1()

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }
    
    //TODO: Write setLength(double newLen), setWidth(double newWid), setX1(int newX1), setY1(int newY1)

    public void setLength(double newLen){
        length = newLen;
    }

    public void setWidth(double newWid){
        width = newWid;
    }

    public void setX1(int newX1){
        x1 = newX1;
    }
    
    public void setY1(int newY1){
        y1 = newY1;
    }

    //TODO: Write area()

    public double area(double len, double wid){
        return len*wid;
    }
    
    //TODO: Write perimeter()

    public double perimeter(double len, double wid){
        return 2*len+2*wid;
    }
    
    //TODO: Write public boolean contains(int x2, int y2)
    
    public boolean contains(int x2, int y2){
        //checks if x2 is less than x1+length, or the far right of r1, and does similar for the y, and returns true if x2 and y2 are in bounds
        if (x2 >= x1 && x2<=x1+width && y2 >= y1 && y2 <= y1+length){
            return true;
        }
        else{
            return false;
        }
    }

    //TODO: Write public boolean intersects(RectangleXY r2)
    
    public boolean intersects(RectangleXY r2){
        int x2 = r2.getX1();
        //r2's horizontal size
        double width2 = r2.getWidth();
        int y2 = r2.getY1();
        //r2's length, verticle size
        double length2 = r2.getLength();
        if (x2+width2 <= x1+width && x2+width2 >= x1 && y2+length2<=y1+length && y2+length2 >= y1){
            return true;
        }
        else{
            return false;
        }
    }

    //TODO: Write public boolean surrounds(RectangleXY r2)
        
    public void draw(){
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(1500,1000);
        DrawRect rect = new DrawRect(this);
        frame.add(rect);
        
        
    }
    
    public static void main(String[] args){
        
        RectangleXY r1 = new RectangleXY(300,700, 100, 100);
        RectangleXY r2 = new RectangleXY(400,500,200,300);
        
        r1.draw();
        r2.draw();
        
        System.out.println(r1.contains(101,99));
        System.out.println(r1.intersects(r2));

        }
}