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
        setSize(1126, 680);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        Game mainGame = new Game();
        getContentPane().add(mainGame);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
            {

                public void run()
                {
                    gameWindow = new Snake();
                    gameWindow.setVisible(true);
                    gameWindow.addKeyListener(new keyHandler());
                }
            });
    }
}
