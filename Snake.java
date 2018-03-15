import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Snake
{
    public final static boolean inDebugMode = true;
    public final static int X = 1126;
    public final static int Y = 680;
    public static JFrame gameWindow = new JFrame();
    public static Game rect1 = new Game(75,Y/2,Color.BLACK,75,17);
    public static Game rect2 = new Game(X/2,Y/2,Color.BLACK,50,10);
    public static void main(String[] args)
    {
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //gameWindow.getContentPane().setLayout(new BoxLayout(gameWindow.getContentPane(), BoxLayout.Y_AXIS));
        //gameWindow.setSize(X, Y);
        rect1.setOpaque(true);
        rect2.setOpaque(true);
        gameWindow.setLayout(new BorderLayout());
        gameWindow.setMinimumSize(new Dimension(X, Y));
        gameWindow.setLocationRelativeTo(null);
        gameWindow.setFocusable(true);
        gameWindow.setFocusTraversalKeysEnabled(false);
        gameWindow.getContentPane().add(rect1);
        gameWindow.getContentPane().add(rect2);
        gameWindow.pack();
        gameWindow.setVisible(true);
        new keyHandler();
        //new Intersects();
    }
}
