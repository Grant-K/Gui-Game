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
        rects.add(new Rectangles((X/2)-75,624,Color.BLACK,75,17));
        rects.add(new Rectangles(X/2,0,new Color(200, 0, 0),50,10));
        //rects.add(new Rectangles(0,0,new Color(200, 0, 0),50,10));
        //System.out.println(Y/2);
        setSize(X, Y);
        setVisible(true);
        add(rects.get(0));
        add(rects.get(1));
        //add(rects.get(2));
        pCheck = new Intersects();
        Timer timer = new Timer();
        timer.schedule(new TimerTask()
            {
                public void run()
                {
                    //System.out.println("Panel Refreshing...");
                    repaint();
                }
            }, 100, 10);
        Timer timer2 = new Timer();
        timer2.schedule(new TimerTask()
            {
                public void run()
                {
                    for(int x = 1; x < rects.size(); x++)
                    {
                        rects.get(x).move();
                    }
                }
            }, 100, 50);
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        //System.out.println(rects.size());
        //System.out.println("Width: " + rects.get(0).getWidth() + " Height: " + rects.get(0).getHeight() + " Size: " + rects.get(0).getSize());
        for(int x = 0; x < rects.size(); x++)
        {
            //System.out.println(x);
            if(x == 0)
            {
                rects.get(x).setPlayer(true);
                rects.get(x).paintComponent(g);
            }
            else
            {
                rects.get(x).paintComponent(g);
            }
        }
    }
}
