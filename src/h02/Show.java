package h02;
import java.awt.*;
import java.applet.*;

public class Show extends Applet {

    public void init() {
        setBackground(Color.LIGHT_GRAY);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawLine(0, 250, 250, 250);
        g.drawLine(125, 75, 250, 250);
        g.drawLine(0, 250, 125, 75);
    }
}