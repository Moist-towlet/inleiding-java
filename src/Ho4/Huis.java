package Ho4;
import java.awt.*;
import java.applet.*;

public class Huis extends Applet {

    public void init() {
        setBackground(Color.LIGHT_GRAY);
    }

    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.drawRect(25, 50, 200, 300);
        g.drawRect(20, 20, 100, 100);
    }
}