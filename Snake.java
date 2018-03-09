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
        new keyHandler();
        gameWindow.add(new Game(0,Y/2,Color.BLACK,75,15));
        gameWindow.setVisible(true);
    }
}
