import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Game implements KeyListener
{
    JFrame gameWindow = new JFrame("Snake");
    final int X = 1000;
    final int Y = 680;

    public Game()
    {
        gameWindow.setSize(X, Y);
        gameWindow.setLocation(300, 180);
        gameWindow.addKeyListener(this);
        gameWindow.setFocusable(true);
        gameWindow.setFocusTraversalKeysEnabled(false);
    }

    public void keyPressed(KeyEvent e) {
        System.out.println("keyPressed");
    }

    public void keyReleased(KeyEvent e) {
        System.out.println("keyReleased");
    }

    public void keyTyped(KeyEvent e) {
        System.out.println("keyTyped");
    }
}
