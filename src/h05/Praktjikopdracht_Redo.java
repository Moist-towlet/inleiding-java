package h05;
import java.awt.*;
import java.applet.Applet;

public class Praktjikopdracht_Redo extends Applet {
Color Lijnen;
Color opvulling;
int breedte;
int hoogte;

    public void init() {
        setSize(450, 950);
        setBackground(Color.pink);
        Lijnen = Color.black;
        opvulling = Color.yellow;
        breedte =  200;
        hoogte = 100;

    }
    public void paint(Graphics g) {
        g.setColor(Lijnen);
        g.drawLine(10,20,300,20);
        g.drawString("Lijn", 10, 40);
        g.drawRect(10, 60,breedte, hoogte);
        g.drawString("Rechthoek", 10, 180);
        g.drawRoundRect(10,190,breedte,hoogte,30,30);
        g.drawString("Rechthoek ronde hoeken", 10, 310);
        g.setColor(opvulling);
        g.fillArc(10, 320,breedte,hoogte,360,360);
        g.setColor(Lijnen);
        g.drawString("Ovaal", 10, 420);
        g.setColor(opvulling);
        g.fillRect(10, 440,300, 100);
        g.setColor(Lijnen);
        g.drawArc(10, 440, 300, 100, 0, 360);
        g.drawString("Ovaal", 10, 555);
        g.drawArc(10, 550,300,100,360,360);
        g.setColor(opvulling);
        g.fillArc(10, 560,300,100,30,45);
        g.setColor(Lijnen);
        g.drawString("Taartpunt met ovaal eromheen", 10, 666);
        g.drawArc(10, 680,100,100,360,360);
        g.drawString("Cirkel", 10, 800);


    }

}
