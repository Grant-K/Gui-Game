import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Snake
{
    final static int X = 1126;
    final static int Y = 680;
    public static JPanel gamePanel = new JPanel();
    public static JFrame gameWindow = new JFrame("Snake");
    public static Game rect1 = new Game(0,Y/2,Color.BLACK,75,17);
    public static void main(String[] args)
    {
        System.out.println(Y/2);
        gameWindow.setSize(X, Y);
        gameWindow.setLocationRelativeTo(null);
        gameWindow.setFocusable(true);
        gameWindow.setFocusTraversalKeysEnabled(false);
        new keyHandler();
        gameWindow.add(rect1);
        gameWindow.setVisible(true);
    }
}
