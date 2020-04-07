package h06;

//Voorbeeld 6.3

import java.awt.*;
import java.applet.*;


public class Variabel extends Applet {
    double geldAmount, personen, loon;

    public void init() {
        setBackground(Color.black);
        geldAmount = 113;
        personen = 4;
        //De berekening

        loon = geldAmount / personen;

    }

    public void paint(Graphics g) {
        g.setColor(Color.pink);
        g.drawString("Jan's gedeelte wordt €" +loon, 10, 20);
        g.drawString("Ali's gedeelte wordt €" +loon, 10, 40);
        g.drawString("Jeanette's gedeelte wordt €" +loon, 10, 60);
        g.drawString("Mijn gedeelte wordt €" +loon, 10, 80);
    }
}