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
    JFrame gameWindow = Snake.gameWindow;
    public void paintComponent(Graphics g) 
    {
        Graphics2D gg = (Graphics2D) g;
        gg.setColor(color);
        gg.fillRect(xpos,ypos,width,height);
    }

    public Game(int x, int y, Color color, int width, int height)
    {
        color = this.color;
        width = this.width;
        height = this.height;
        xpos = x;
        ypos = y;
    }
}
