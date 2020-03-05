package h02;
import java.awt.*;
import java.applet.*;

public class Show extends Applet {

    public void init() {
        setBackground(Color.gray);
    }

    public void paint(Graphics g) {
        g.setColor(Color.green);
        g.drawString("Welcome to Java!!", 50, 60 );
        g.setColor(Color.blue);
        g.drawString("Sjors", 50, 120 );
        g.setColor(Color.red);
        g.drawString("De Boer", 50, 135 );
    }
}