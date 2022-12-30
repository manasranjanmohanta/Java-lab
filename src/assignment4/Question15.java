package assignment4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyClass extends JFrame implements ActionListener {
    Container cn;
    JLabel l1, l2;
    JButton b1, b2;

    MyClass(){
        cn = getContentPane();
        setTitle("Simple application for color recognition for kids");
        setSize(1000, 1000);
        setLayout(null);
        setVisible(true);


        b1 = new JButton("Red");
        b1.setForeground(Color.black);
        b1.setBackground(Color.red);
        b1.setBounds(400, 400, 80, 30);
        b1.addActionListener(this);
        cn.add(b1);

        b2 = new JButton("Blue");
        b2.setForeground(Color.black);
        b2.setBackground(Color.blue);
        b2.setBounds(500, 400, 80, 30);
        b2.addActionListener(this);
        cn.add(b2);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            setVisible(false);
            new Window1();
        }
        else {
            setVisible(false);
            new Window2();
        }
    }
}
class Window1 extends JFrame implements ActionListener {
    Container cn;
    JLabel l1, l2;
    JButton b1, b2;

    Window1(){
        cn = getContentPane();
        setTitle("Simple application for color recognition for kids");
        setSize(1000, 1000);
        setLayout(null);
        setVisible(true);
        cn.setBackground(Color.red);

        l1 = new JLabel("Window-1");
        l1.setBounds(470, 100, 100, 30);
        l1.setForeground(Color.black);
        cn.add(l1);

        b1 = new JButton("Red");
        b1.setForeground(Color.black);
        b1.setBackground(Color.red);
        b1.setBounds(400, 400, 80, 30);
        b1.addActionListener(this);
        cn.add(b1);

        b2 = new JButton("Blue");
        b2.setForeground(Color.black);
        b2.setBackground(Color.blue);
        b2.setBounds(500, 400, 80, 30);
        b2.addActionListener(this);
        cn.add(b2);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            setVisible(false);
            new Window1();
        }
        else {
            setVisible(false);
            new Window2();
        }
    }
}


// For Windows 2
class Window2 extends JFrame implements ActionListener {
    Container cn;
    JLabel l1, l2;
    JButton b1, b2;

    Window2(){
        cn = getContentPane();
        setTitle("Simple application for color recognition for kids");
        setSize(1000, 1000);
        setLayout(null);
        setVisible(true);
        cn.setBackground(Color.blue);

        l1 = new JLabel("Window-2");
        l1.setBounds(470, 100, 100, 30);
        l1.setForeground(Color.black);
        cn.add(l1);

        b1 = new JButton("Red");
        b1.setForeground(Color.black);
        b1.setBackground(Color.red);
        b1.setBounds(400, 400, 80, 30);
        b1.addActionListener(this);
        cn.add(b1);

        b2 = new JButton("Blue");
        b2.setForeground(Color.black);
        b2.setBackground(Color.blue);
        b2.setBounds(500, 400, 80, 30);
        b2.addActionListener(this);
        cn.add(b2);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            setVisible(false);
            new Window1();
        }
        else {
            setVisible(false);
            new Window2();
        }
    }
}

public class Question15 {
    public static void main(String[] args) {
    new MyClass();
    }

}
