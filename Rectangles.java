import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Rectangles
{
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
        xpos = x;
        ypos = y;
    }

    public void fillRect(Graphics g)
    {
        Graphics2D gg = (Graphics2D) g;
        gg.setColor(color);
        gg.fillRect(xpos, ypos, width, height);
    }
}
