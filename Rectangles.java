import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
import java.lang.Math;
public class Rectangles extends JComponent
{
    private final static boolean inDebugMode = Snake.inDebugMode;
    private final static int frameWidth = Game.X;
    private final static int frameHeight = Game.Y;
    private Color color;
    private boolean player = false;
    private int xpos;
    private int ypos;
    private static Random rand = new Random();
    public static double moveAngle;
    public static int speed = 5;
    public Rectangles(int x, int y, Color color, int width, int height)
    {
        this.color = color;
        setPreferredSize(new Dimension(width, height));
        System.out.println(""+color+""+width+""+height);
        xpos = x;
        ypos = y;
        moveAngle = (double)180 + rand.nextDouble() * ((double)0 - (double)180);
        System.out.println(moveAngle);
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
//         if(inDebugMode)
//         {
//             System.out.println("Xpos = " + xpos + "\nWidth = " + width + "\nframeWidth = " + frameWidth);
//         }
        if((xpos + 5 + getWidth()) <= frameWidth)
        {
            xpos += 5;            
        }
        if(inDebugMode)
            System.out.println("New X Pos = " + xpos);
    }
    
    public void moveDown()
    {
        if((ypos + 5 + getHeight()) <= frameHeight)
        {
            ypos += 5;
        }
        if(inDebugMode)
            System.out.println("New Y Pos = " + ypos);
    }
    
    public void paintComponent(Graphics g)
    {
        Graphics2D gg = (Graphics2D) g;
        gg.setColor(color);
        gg.fillRect(xpos, ypos, (int) getPreferredSize().getWidth(), (int) getPreferredSize().getHeight());
        setLocation(xpos, ypos);
        //System.out.println(player);
        if(player)
        {
            Game.pCheck.checkIntersect(gg);
        }
    }
    
    public void setPlayer(boolean isPlayer)
    {
        player = isPlayer;
    }
    
    public void draw()
    {
        repaint();
    }

    public void move()
    {
        xpos += speed * Math.cos(Math.toRadians(moveAngle));
        ypos += speed * Math.sin(Math.toRadians(moveAngle));
        System.out.println(xpos);
        System.out.println(ypos);
    }
}
