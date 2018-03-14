import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Intersects
{
    JFrame gameWindow = Snake.gameWindow;
    Game rect1 = Snake.rect1;
    Game rect2 = Snake.rect2;
    //Rectangle rect2r = rect2.getClipBounds();
    public Intersects()
    {
        Timer t = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(rect2g.intersects(rect2g))
                    System.out.println("They are intersecting!");
            }
        });
    }
}
