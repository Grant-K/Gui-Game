import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Intersects
{
    ArrayList<Rectangles> rects = Game.rects;
    public final static boolean inDebugMode = Snake.inDebugMode;
    public Intersects()
    {
        //System.out.println("Intersects Created");
    }

    public void checkIntersect(Graphics2D gg)
    {
        //System.out.println("THIS PRINT" + rects.get(1).getBounds() + " " + rects.get(0).getBounds());
        //System.out.println(rects.size());
        if((gg.hit((rects.get(1).getBounds()), (rects.get(0).getBounds()), false)));// || (gg.hit((rects.get(2).getBounds()), (rects.get(0).getBounds()), false)))
        {
            System.out.println("They are intersecting! So you lose!");
            if(inDebugMode)
                System.out.println("THIS PRINT" + rects.get(1).getBounds() + " " + rects.get(0).getBounds() + " " + rects.get(2).getBounds());
            System.exit(0);
        }
    }
}
