import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Game extends JPanel
{
    public final static int X = 1126;
    public final static int Y = 680;
    public static Intersects pCheck;
    public static ArrayList<Rectangles> rects = new ArrayList<Rectangles>();
    public Game()
    {
        super();
        rects.add(new Rectangles(0,Y/2,Color.BLACK,75,17));
        rects.add(new Rectangles(X/2,Y/2,Color.BLACK,50,10));
        System.out.println(Y/2);
        setSize(X, Y);
        add(rects.get(0));
        add(rects.get(1));
        setVisible(true);
        pCheck = new Intersects();
        Timer timer = new Timer();
        timer.schedule(new TimerTask()
        {
            public void run()
            {
                System.out.println("Panel Refreshing...");
                repaint();
            }
        }, 1000, 200);
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        System.out.println(rects.size());
        //System.out.println("Width: " + rects.get(0).getWidth() + " Height: " + rects.get(0).getHeight() + " Size: " + rects.get(0).getSize());
        for(int x = 0; x < rects.size(); x++)
        {
            if(x == 0)
            {
                rects.get(x).setPlayer(true);
                rects.get(x).draw();
            }
            else
            {
                rects.get(x).draw();
            }
        }
    }
}
