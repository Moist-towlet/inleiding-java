package Ho4;
import java.awt.*;
import java.applet.*;

public class Huis extends Applet {

    public void init() {
        setBackground(Color.pink);
    }

    public void paint(Graphics g) {
        g.setColor(Color.gray);
        g.fillRect(15, 40, 300, 300);
        g.setColor(Color.cyan);
        g.fillRect(30, 77, 75, 75);
        g.fillRect(115, 77, 75, 75);
        g.setColor(Color.black);
        g.fillRect(200, 150, 75, 150);
    }
}