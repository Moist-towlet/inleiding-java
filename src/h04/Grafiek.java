package h04;
        import java.awt.*;
        import java.applet.Applet;

public class Grafiek extends Applet {

    public void init() {
        setSize(450, 950);
        setBackground(Color.darkGray);
    }
    public void paint(Graphics g) {
        g.setColor(Color.cyan);
        g.drawLine(75, 450, 375, 450);
        g.drawLine(75, 450, 75, 125);
        g.setColor(Color.magenta);
        g.fillRect(85, 410, 50, 40);
        g.setColor(Color.green);
        g.fillRect(185, 350, 50, 100);
        g.setColor(Color.red);
        g.fillRect(285, 370 , 50, 80);
        g.setColor(Color.cyan);
        g.drawString("Valerie", 90, 470);
        g.drawString("Jeroen", 190, 470);
        g.drawString("Hans", 295, 470);
        g.drawString("40", 95, 405);
        g.drawString("100", 195, 345);
        g.drawString("80", 295, 365);

    }

}
