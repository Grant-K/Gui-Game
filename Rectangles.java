import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Rectangles extends JComponent
{
    private final static boolean inDebugMode = Snake.inDebugMode;
    private final static int frameWidth = Game.X;
    private final static int frameHeight = Game.Y;
    private Color color;
    private int width;
    private int height;
    private int xpos;
    private int ypos;
    public Rectangles(int x, int y, Color color, int width, int height)
    {
        this.color = color;
        this.width = width;
        this.height = height;
        System.out.println(""+color+""+width+""+height);
        xpos = x;
        ypos = y;
    }
    
    public void moveLeft()
    {
        if(xpos - 5 >= 0)
        {
            xpos -= 5;
        }
        if(inDebugMode)
            System.out.println("New X Pos = " + xpos);
    }
    
    public void moveUp()
    {
        if(ypos - 5 >= 0)
        {
            ypos -= 5;
        }
        if(inDebugMode)
            System.out.println("New Y Pos = " + ypos);
    }

    public void moveRight()
    {
        if(inDebugMode)
        {
            System.out.println("Xpos = " + xpos + "\nWidth = " + width + "\nframeWidth = " + frameWidth);
        }
        if((xpos + 5 + width) <= frameWidth)
        {
            xpos += 5;            
        }
        if(inDebugMode)
            System.out.println("New X Pos = " + xpos);
    }
    
    public void moveDown()
    {
        if((ypos + 5 + height) <= frameHeight)
        {
            ypos += 5;
        }
        if(inDebugMode)
            System.out.println("New Y Pos = " + ypos);
    }
    
    public void paint(Graphics g)
    {
        Graphics2D gg = (Graphics2D) g;
        gg.setColor(color);
        gg.fillRect(xpos, ypos, width, height);
    }
}
