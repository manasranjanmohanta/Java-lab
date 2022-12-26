//package assignment4;

import java.applet.Applet;
import java.awt.*;
//<applet code=Question10.class width=490 height=500></applet>

public class Question10  extends Applet implements Runnable {
    Thread t;

    public void start(){
        t = new Thread(this);
        t.start();
    }

    public  void  paint(Graphics g){
        g.setColor(Color.yellow);
        g.fillOval(180, 180, 110, 110);

        g.setColor(Color.black);
        g.fillOval(200, 210, 30, 30);
        g.fillOval(240, 210, 30, 30);

        g.drawArc(210, 240, 50, 30, 180,180);
    }
    public void run(){
        try{
            while(true){
                Thread.sleep(1000);
                repaint();
            }
        }   catch (Exception e){
            e.printStackTrace();
        }
    }
}
