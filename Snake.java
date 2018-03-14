import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Snake
{
    public final static boolean inDebugMode = true;
    final static int X = 1126;
    final static int Y = 680;
    public static JFrame gameWindow = new JFrame("Snake");
    public static Game rect1 = new Game(0,Y/2,Color.BLACK,75,17);
    public static Game rect2 = new Game(X/2,Y/2,Color.BLACK,50,10);
    public static void main(String[] args)
    {
        Container gameContentPane = gameWindow.getContentPane();
        // NEED TO USE FLOW LAYOUT BUT DOESNT WORK AS IS gameContentPane.setLayout(new FlowLayout());
        gameWindow.setSize(X, Y);
        gameWindow.setLocationRelativeTo(null);
        gameContentPane.setFocusable(true);
        gameContentPane.setFocusTraversalKeysEnabled(false);
        new keyHandler();
        gameContentPane.add(rect1);
        gameContentPane.add(rect2);
        gameWindow.setVisible(true);
        gameContentPane.setVisible(true);
        //new Intersects();
    }
}
