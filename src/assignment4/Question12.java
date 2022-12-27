package assignment4;

import java.applet.Applet;
import java.awt.*;
//<applet code=Question12.class width=400 height=600></applet>

public class Question12 extends Applet implements Runnable {
    Thread t;
    int x = 170;
    int y = 50;
    public void start(){
        t = new Thread(this);
        t.start();
    }

    public void paint(Graphics g){
        g.setColor(Color.blue);
        g.fillRect(x, y, 50, 50);
    }
    public void run(){
        try {
            while(true){
                if(y == 550){
                    x = 170;
                    y = 50;
                    repaint();
                } else{
                    y = y + 5;
                    repaint();
                    Thread.sleep(100);
                }
            }
        }   catch(Exception e){
            e.printStackTrace();
        }
    }
}
