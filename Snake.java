import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Snake extends JFrame
{
    public final static boolean inDebugMode = true;
    public final static int X = 1126;
    public final static int Y = 680;
    public static JFrame gameWindow = new JFrame("Game");
    public static JPanel gamePanel = new JPanel();
    public static Game rect1 = new Game(75,Y/2,Color.BLACK,75,17);
    public static Game rect2 = new Game(X/2,Y/2,Color.BLACK,50,10);
    public static void main(String[] args)
    {
        gameWindow.setSize(X, Y);
        //gameWindow.setLayout(null);
        //gamePanel.setLayout(null);
        gamePanel.requestFocus();
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //gameWindow.getContentPane().setLayout(new BoxLayout(gameWindow.getContentPane(), BoxLayout.Y_AXIS));
        //rect1.setOpaque(true);
        //rect2.setOpaque(true);
        //gameWindow.setMinimumSize(new Dimension(X, Y));
        gameWindow.setLocationRelativeTo(null);
        gameWindow.setFocusable(true);
        gameWindow.setFocusTraversalKeysEnabled(false);
        gameWindow.add(rect1);
        gameWindow.add(rect2);
        //gamePanel.setVisible(true);
        //gameWindow.pack();
        //gameWindow.add(gamePanel);
        gameWindow.setVisible(true);
        new keyHandler();
        //new Intersects();
    }
}
