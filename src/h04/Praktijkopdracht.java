package h04;
import java.awt.*;
import java.applet.Applet;

public class Praktijkopdracht extends Applet {

    public void init() {
        setSize(450, 950);
        setBackground(Color.pink);
    }
    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawLine(10,20,300,20);
        g.drawString("Lijn", 10, 40);
        g.drawRect(10, 60,300, 100);
        g.drawString("Rechthoek", 10, 180);
        g.drawRoundRect(10,190,300,100,30,30);
        g.drawString("Rechthoek ronde hoeken", 10, 310);
        g.setColor(Color.magenta);
        g.fillArc(10, 320,300,100,360,360);
        g.setColor(Color.black);
        g.drawString("Ovaal", 10, 420);
        g.setColor(Color.MAGENTA);
        g.fillRect(10, 440,300, 100);
        g.setColor(Color.black);
        g.drawArc(10, 440, 300, 100, 0, 360);
        g.drawString("Ovaal", 10, 555);
        g.drawArc(10, 550,300,100,360,360);
        g.setColor(Color.MAGENTA);
        g.fillArc(10, 560,300,100,30,45);
        g.setColor(Color.black);
        g.drawString("Taartpunt met ovaal eromheen", 10, 666);
        g.drawArc(10, 680,100,100,360,360);
        g.drawString("Cirkel", 10, 800);


    }

}
