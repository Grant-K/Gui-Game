import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Game extends JPanel
{
    public final static int X = 1126;
    public final static int Y = 680;
    public static Intersects pCheck;
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
        add(rects.get(0));
        add(rects.get(1));
        setVisible(true);
        Thread animationThread = new Thread(new Runnable()
                {
                    public void run() 
                    {
                        while (true) 
                        {
                            revalidate();
                            repaint();
                            //System.out.println("Refresh Ran");
                            try {Thread.sleep(10);} catch (Exception ex) {System.out.println("Error");}
                        }
                    }
                });
        animationThread.start();
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        pCheck = new Intersects();
        //System.out.println("Width: " + rects.get(0).getWidth() + " Height: " + rects.get(0).getHeight() + " Size: " + rects.get(0).getSize());
        for(int x = 0; x < rects.size(); x++)
        {
            if(x == 0)
            {
                rects.get(x).setPlayer(true);
                rects.get(x).paintComponent(g);
            }
            else
                rects.get(x).paintComponent(g);
        }
    }
}
