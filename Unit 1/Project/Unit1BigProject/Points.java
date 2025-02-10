import java.util.Scanner;

public class Points {
    public static void main(String[] args){
        Points.pointsToFormula();
    }

    public static void pointsToFormula(){
        //(-7, 4) & (1, 5) y=0.125x+4.875 1x+-8y=-39
        Scanner scannyBoi = new Scanner(System.in);
        System.out.println("Enter two points(x1,y1), (x2, y2)");
        System.out.print("x1: ");
        int x1 = scannyBoi.nextInt();
        System.out.print("y1: ");
        int y1 = scannyBoi.nextInt();
        System.out.print("x2: ");
        int x2 = scannyBoi.nextInt();
        System.out.print("y2: ");
        int y2 = scannyBoi.nextInt();
        double mY = y1-y2;
        double mX = x1-x2;
        double m = mY/mX;
        double b = y1-m*x1;
        String slopeIntercept = "y = "+m+"x+"+b;
        String standardForm = (-1*mY)+"x+"+mX+"y="+((-x1*m+y1)*(-mX));
        System.out.println("("+x1+","+y1+"), and is \n"+slopeIntercept+" in slope intercept,\nand "+standardForm+" in standard form.");
    }
}
