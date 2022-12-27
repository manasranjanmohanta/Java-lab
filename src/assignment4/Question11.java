//package assignment4;

import java.applet.Applet;
import java.awt.*;
//<applet code = Question11.class width = 800 height = 300> </applet>
public class Question11 extends Applet implements Runnable {
    Thread t;
    int x = 100;
    int y = 100;
    public void start(){
        t = new Thread(this);
        t.start();
    }

    public void paint(Graphics g){
        g.setColor(Color.green);
        g.fillOval(x, y, 50, 50);
    }

    public void run(){
        try {
            while (true) {
                if (x == 700) {
                    x = 100;
                    y = 100;
                    repaint();
                } else {
                    x = x + 5 ;
                    repaint();
                    Thread.sleep(100);
                }
            }
        }   catch(Exception e){
            e.printStackTrace();
        }
    }
}
