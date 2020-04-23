package h06;

import java.awt.*;
import java.applet.*;

public class Negatieve_int extends Applet {
    int A1, A2, B1;

    public void init(){
        setBackground(Color.black);
        A1 = 2147483647;
        A2 = 2147483647;

        B1 = A1 + A2;
    }
    public void paint(Graphics g) {
        g.setColor(Color.pink);
        g.drawString("De negatieve waarde is = "+ B1, 10, 20);


    }
}