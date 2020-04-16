package h06;

import java.awt.*;
import java.applet.*;

public class Tijd extends Applet {
    double seconde, uur, dag, jaar, minuut, a1, a2, a3;

    public void init(){
        setBackground(Color.black);
        minuut = 60;
        uur = 60;
        dag = 24;
        jaar = 365;

        // berekening

        a1 = minuut * uur;
        a2 = (uur * minuut) * dag;
        a3 = a2 * jaar;

    }
    public void paint(Graphics g) {
        g.setColor(Color.pink);
        g.drawString("Seconden per uur =" +a1, 10, 20);
        g.drawString("Seconden per dag =" +a2, 10, 40);
        g.drawString("Seconden per Jaar =" +a3, 10, 60);


    }
}