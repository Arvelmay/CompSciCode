import javax.swing.JPanel;
import java.awt.*;

/**
 * Write a description of class DrawRect here.
 *
 * @author Alfonso
 * @version 1
 */
public class DrawRect extends JPanel
{
    private int squareX;
    private int squareY;
    private double squareW;
    private double squareH;

    public DrawRect (RectangleXY r){
        this.squareX = r.getX1();
        this.squareY = r.getY1();
        this.squareW = r.getWidth();
        this.squareH = r.getLength();}
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // do your superclass's painting routine first, and then paint on top of it.
        g.setColor(Color.RED);
        g.fillRect(squareX,squareY,(int)squareW,(int)squareH);
    }
}
