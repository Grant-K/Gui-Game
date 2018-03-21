import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Snake extends JFrame
{
    public final static boolean inDebugMode = true;
    public static JFrame gameWindow;
    public Snake()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1126, 680);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        Game mainGame = new Game();
        getContentPane().add(mainGame);
        requestFocus();
        requestFocusInWindow();
        setVisible(true);
    }

    public static void main(String[] args)
    {
        gameWindow = new Snake();
        gameWindow.addKeyListener(new keyHandler());
    }
}
