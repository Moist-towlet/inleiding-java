package h05;
import java.awt.*;
import java.applet.Applet;

public class Grafiek52 extends Applet {
int A1;
int Hoogte;
int namen;
int breed1;

    public void init() {
        setSize(450, 950);
        setBackground(Color.darkGray);
        A1 = 80;
        Hoogte = 20;
        namen = 15;
        breed1 = 10;
    }
    public void paint(Graphics g) {
        g.setColor(Color.cyan);
        g.drawLine(breed1,Hoogte, 400, Hoogte);
        g.drawLine(breed1,Hoogte, breed1, 900);
        g.setColor(Color.magenta);
        g.fillRect(85, Hoogte, 50, A1);
        g.setColor(Color.cyan);
        g.drawString("Valerie", 90, namen);
        g.drawString("40", 95,115);

    }

}
