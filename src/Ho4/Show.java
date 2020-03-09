package Ho4;

import java.awt.*;
import java.applet.*;

public class Show extends Applet {

    public void init() {
        setBackground(Color.LIGHT_GRAY);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawLine(50, 250, 250, 250);

    }
}