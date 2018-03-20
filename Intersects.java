import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Intersects
{
    ArrayList<Rectangles> rects = Game.rects;
    public Intersects()
    {
        System.out.print("");
    }

    public void checkIntersect(Graphics2D gg)
    {
        System.out.println("THIS PRINT" + rects.get(1).getLocation() + " " + rects.get(0).getLocation());
        if(gg.hit(new Rectangle(rects.get(1).getBounds()), new Rectangle(rects.get(0).getBounds()), false))
            System.out.println("They are intersecting!");
    }
}
