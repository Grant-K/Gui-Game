import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class keyHandler implements KeyListener
{
    public final static boolean inDebugMode = Snake.inDebugMode;
    JFrame gameWindow = Snake.gameWindow;
    Game rect1 = Snake.rect1;
    public keyHandler()
    {
        gameWindow.addKeyListener(this);
    }

    public void keyPressed(KeyEvent e) {
        if(inDebugMode)
        {
            System.out.println("keyPressed");
            displayKeyInfo(e, "keyPressed");
            System.out.println("Key Code = " + e.getKeyCode() + " Key Text = " + e.getKeyText(e.getKeyCode()));
        }
        if(e.getKeyCode() == 37)
        {
            rect1.moveLeft();
        }
        else if(e.getKeyCode() == 38)
        {
            rect1.moveUp();
        }
        else if(e.getKeyCode() == 39)
        {
            rect1.moveRight();
        }
        else if(e.getKeyCode() == 40)
        {
            rect1.moveDown();
        }
    }

    public void keyReleased(KeyEvent e) {
        if(inDebugMode)
        {
            System.out.println("keyReleased");
            displayKeyInfo(e, "keyReleased");
        }
    }

    public void keyTyped(KeyEvent e) {
        if(inDebugMode)
        {
            System.out.println("keyTyped");
            displayKeyInfo(e, "keyTyped");
        }
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
