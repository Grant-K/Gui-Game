import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Snake
{
    public static JFrame gameWindow = new JFrame("Snake");
    final static int X = 1000;
    final static int Y = 680;
    public static void main(String[] args)
    {
        gameWindow.setSize(X, Y);
        gameWindow.setLocationRelativeTo(null);
        gameWindow.setFocusable(true);
        gameWindow.setFocusTraversalKeysEnabled(false);
        gameWindow.setVisible(true);
        new keyHandler();
        Game rect1 = new Game(X,Y,Color.BLACK,20,20);
        gameWindow.getContentPane().add(rect1, BorderLayout.CENTER);
        gameWindow.repaint();
    }
}
