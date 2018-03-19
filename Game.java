import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Game extends JPanel
{
    public final static int X = 1126;
    public final static int Y = 680;
    public static ArrayList<Rectangles> rects = new ArrayList<Rectangles>();
    public static Rectangles rect1 = new Rectangles(0,Y/2,Color.BLACK,75,17);
    public static Rectangles rect2 = new Rectangles(X/2,Y/2,Color.BLACK,50,10);
    public Game()
    {
        super();
        rects.add(rect1);
        rects.add(rect2);
        System.out.println(Y/2);
        setSize(X, Y);
        add(rect1);
        add(rect2);
        setVisible(true);
        Thread animationThread2 = new Thread(new Runnable()
                {
                    public void run() 
                    {
                        while (true) 
                        {
                            revalidate();
                            repaint();
                            try {Thread.sleep(10);} catch (Exception ex) {}
                        }
                    }
                });
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        for(Rectangles rect : rects)
        {
            rect.paint(g);
        }
    }
}
