import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Game extends JComponent
{
    private final static boolean inDebugMode = Snake.inDebugMode;
    private final static int frameWidth = Snake.X;
    private final static int frameHeight = Snake.Y;
    private Color color;
    private int width;
    private int height;
    private int xpos;
    private int ypos;
    public void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
    }

    public Game(int x, int y, Color color, int width, int height)
    {
        this.color = color;
        this.width = width;
        this.height = height;
        if(inDebugMode)
            System.out.println(""+color+""+width+""+height);
        xpos = x;
        ypos = y;
        repaint();
    }

    public void moveLeft()
    {
        if(xpos - 5 >= 0)
        {
            xpos -= 5;
        }
        if(inDebugMode)
            System.out.println("New X Pos = " + xpos);
        repaint();
    }
    
    public void moveUp()
    {
        if(ypos - 5 >= 0)
        {
            ypos -= 5;
        }
        if(inDebugMode)
            System.out.println("New Y Pos = " + ypos);
        repaint();
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
        repaint();
    }
    
    public void moveDown()
    {
        if((ypos + 5 + height) <= frameHeight)
        {
            ypos += 5;
        }
        if(inDebugMode)
            System.out.println("New Y Pos = " + ypos);
        repaint();
    }
    
    public int getWidth()
    {
        return width;
    }
    
    public int getHeight()
    {
        return height;
    }
    
    public int getXPos()
    {
        return xpos;
    }
    
        public int getYPos()
    {
        return ypos;
    }
}
