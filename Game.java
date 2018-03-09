import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Game extends JComponent
{
    JFrame gameWindow = Snake.gameWindow;
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
        System.out.println("getWidth Returns: " + gameWindow.getWidth() + " getSize Returns" + gameWindow.getSize() + " this.getWidth Returns" + this.getWidth() + " THIS" + this.toString());
        if(xpos + 5 + this.getWidth() <= gameWindow.getWidth())
        {
            xpos += 5;            
        }
        System.out.println("New X Pos = " + xpos);
        repaint();
    }
    
    public void moveDown()
    {
        System.out.println("getHeight Returns: " + gameWindow.getHeight() + " getSize Returns" + gameWindow.getSize() + " this.getHeight Returns" + this.getHeight());
        if(ypos + 5 + this.getHeight() <= gameWindow.getHeight())
        {
            ypos += 5;
        }
        System.out.println("New Y Pos = " + ypos);
        repaint();
    }
}
