package Ho4;
import java.awt.*;
import java.applet.*;

public class Huis extends Applet {

    public void init() {
        setBackground(Color.pink);
    }

    //Note to self: moet leren beter stuff in te delen

    public void paint(Graphics g) {
        g.setColor(Color.gray);
        g.fillRect(5, 40, 300, 300);
        g.setColor(Color.cyan);
        g.fillRect(30, 77, 75, 75);
        g.fillRect(115, 77, 75, 75);
        g.setColor(Color.black);
        g.fillRect(200, 150, 75, 150);
        //Code voor de vlag
        g.setColor(Color.darkGray);
        g.fillRect(325, 40, 5, 300);
        g.setColor(Color.red);
        g.fillRect(330, 40, 45, 20);
        g.setColor(Color.white);
        g.fillRect(330, 60, 45, 20);
        g.setColor(Color.blue);
        g.fillRect(330, 80, 45, 20);
        g.setColor(Color.red);
        g.fillRect(375, 50, 45, 20);
        g.setColor(Color.white);
        g.fillRect(375, 70, 45, 20);
        g.setColor(Color.blue);
        g.fillRect(375, 90, 45, 20);


    }
}