package h06;

//Voorbeeld 6.3

import java.awt.*;
import java.applet.*;


public class Variabel extends Applet {
    double a, b, c, uitkomst;
    double scoredouble;
    int scoreint;

    public void init() {
        scoredouble = 44.8;
        scoreint = (int) scoredouble;
        a = 8;
        b = 8;
        c = 3;
        uitkomst = (a + b) / c;



    }

    public void paint(Graphics g) {

        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
        g.drawString("De convertie is " + scoreint, 20, 30);
    }
}