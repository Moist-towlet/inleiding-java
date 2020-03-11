package h04;
import java.awt.*;
import java.applet.Applet;

public class Dobbelsteen extends Applet {

    public void init() {
        setSize(450, 950);
        setBackground(Color.pink);
    }
    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.fillRoundRect(180,377,100,100,50,50);
        g.setColor(Color.black);
        g.fillArc(200, 400,20,20,360,360);
        g.fillArc(240, 400,20,20,360,360);
        g.fillArc(240, 440,20,20,360,360);
        g.fillArc(200, 440,20,20,360,360);

    }

}
