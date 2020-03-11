package h04;
import java.awt.*;
import java.applet.Applet;

public class Ellipse extends Applet {

    public void init() {
        setSize(450, 950);
        setBackground(Color.pink);
    }
        public void paint(Graphics g) {
            g.setColor(Color.gray);
            g.fillRect(195, 290, 60,190);
            g.setColor(Color.red);
            g.fillArc(200, 300,50,50,360,360);
            g.setColor(Color.yellow);
            g.fillArc(200, 360,50,50,360,360);
            g.setColor(Color.green);
            g.fillArc(200, 420,50,50,360,360);
            g.setColor(Color.gray);
            g.fillRect(220, 480, 10, 180);

    }

}
