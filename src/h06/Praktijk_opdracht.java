package h06;

import java.awt.*;
import java.applet.*;

public class Praktijk_opdracht extends Applet {
    double A1, A2, A3;
    double B1;

    public void init(){
        setBackground(Color.black);
        A1 = 5.9;
        A2 = 6.3;
        A3 = 6.9;
        B1 = (A1 + A2 + A3) / 3 * 10;
        B1 = (int) B1;
        B1 = B1 / 10;


    }
    public void paint(Graphics g) {
        g.setColor(Color.pink);
        g.drawString("Het gemiddelde is = " + B1, 10, 20);


    }
}