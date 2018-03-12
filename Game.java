import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Game extends JComponent
{
    public Color color;
    public int width;
    public int height;
    public int xpos;
    public int ypos;
    public void paintComponent(Graphics g) 
    {
        Graphics2D gg = (Graphics2D) g;
        gg.setColor(color);
        gg.fillRect(xpos,ypos,width,height);
    }

    public Game(int x, int y, Color color, int width, int height)
    {
        this.color = color;
        this.width = width;
        this.height = height;
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
        System.out.println("New X Pos = " + xpos);
        repaint();
    }
    
    public void moveUp()
    {
        if(ypos - 5 >= 0)
        {
            ypos -= 5;
        }
        System.out.println("New Y Pos = " + ypos);
        repaint();
    }

    public void moveRight()
    {
        if((xpos + 5 + width) <= this.getWidth())
        {
            xpos += 5;            
        }
        System.out.println("New X Pos = " + xpos);
        repaint();
    }
    
    public void moveDown()
    {
        if((ypos + 5 + height) <= this.getHeight())
        {
            ypos += 5;
        }
        System.out.println("New Y Pos = " + ypos);
        repaint();
    }
}
