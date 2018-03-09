import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Snake
{
    final static int X = 1000;
    final static int Y = 680;
    public static JFrame gameWindow = new JFrame("Snake");
    public static Game rect1 = new Game(0,Y/2,Color.BLACK,75,15);
    public static void main(String[] args)
    {
        gameWindow.setSize(X, Y);
        gameWindow.setLocationRelativeTo(null);
        gameWindow.setFocusable(true);
        gameWindow.setFocusTraversalKeysEnabled(false);
        new keyHandler();
        gameWindow.getContentPane().add(rect1);
        gameWindow.setVisible(true);
    }
}
