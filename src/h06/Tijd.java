package h06;

import java.awt.*;
import java.applet.*;

public class Tijd extends Applet {
    double seconden, uren, dagen, jaar;

    public void init() {
        setBackground(Color.black);
        seconden = 60;
        uren = 1;
        dagen = 360;
        jaar = 1;
    }
    public void paint(Graphics g) {
        g.setColor(Color.pink);
        g.drawString("Seconden per uur =" +jaar, 10, 20);


    }
}