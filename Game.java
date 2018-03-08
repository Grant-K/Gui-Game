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
        gameWindow.setLocation(480, 360);
        gameWindow.addKeyListener(this);
        gameWindow.setFocusable(true);
        gameWindow.setFocusTraversalKeysEnabled(false);
        gameWindow.setVisible(true);
    }

    public void keyPressed(KeyEvent e) {
        System.out.println("keyPressed");
        displayKeyInfo(e, "keyPressed");
    }

    public void keyReleased(KeyEvent e) {
        System.out.println("keyReleased");
        displayKeyInfo(e, "keyReleased");
    }

    public void keyTyped(KeyEvent e) {
        System.out.println("keyTyped");
        displayKeyInfo(e, "keyTyped");
    }
    
    private void displayKeyInfo(KeyEvent e, String eventType)
    {
        int typeId = e.getID();
        int keyCode = -1;
        String keyText;
        String printString;
        if(typeId == KeyEvent.KEY_RELEASED)
        {
            keyCode = e.getKeyCode();
            keyText = KeyEvent.getKeyText(keyCode);
            printString = "Key Code = " + keyCode + "\nKey's Text = " + keyText;
            System.out.println(printString);
        }
        else
        {
            System.out.println("Was not a key released event!");
        }
    }
}
