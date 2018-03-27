import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Snake extends JFrame
{
    static GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
    static GraphicsDevice gs = ge.getDefaultScreenDevice();
    public final static boolean inDebugMode = false;
    public static JFrame gameWindow;
    public Snake()
    {
        super("Game", gs.getDefaultConfiguration());
        System.out.println("Dont get hit by the red rectangle otherwise you lose!");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1126, 680);
        setLocationRelativeTo(null);
        setFocusable(true);
        setResizable(false);
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
