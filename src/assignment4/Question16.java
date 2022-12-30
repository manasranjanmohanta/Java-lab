package assignment4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyCal extends JFrame implements ActionListener{
    Container cn;
    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton b1, b2, b3, b4, b5, b6;

    MyCal(){
        cn = getContentPane();
        setTitle("Simple Calculator");
        setLayout(null);
        setSize(1200, 1000);
        setVisible(true);

        l1 = new JLabel("Enter 1st number : ");
        l1.setBounds(50, 100, 150, 40);
        cn.add(l1);
        t1 = new JTextField();
        t1.setBounds(400, 100, 200, 40);
        cn.add(t1);


        l2 = new JLabel("Enter 2nd number : ");
        l2.setBounds(50, 200, 150, 40);
        cn.add(l2);
        t2 = new JTextField();
        t2.setBounds(400, 200, 200, 40);
        cn.add(t2);

        l1 = new JLabel("Result : ");
        l1.setBounds(50, 300, 150, 40);
        cn.add(l1);
        t3 = new JTextField();
        t3.setBounds(400, 300, 200, 40);
        cn.add(t3);

        b1 = new JButton("Summation");
        b1.setBounds(50, 500, 120, 30);
        b1.addActionListener(this);
        cn.add(b1);

        b2 = new JButton("Subtraction");
        b2.setBounds(190, 500, 120, 30);
        b2.addActionListener(this);
        cn.add(b2);

        b3 = new JButton("Multiplication");
        b3.setBounds(330, 500, 120, 30);
        b3.addActionListener(this);
        cn.add(b3);

        b4 = new JButton("Division");
        b4.setBounds(470, 500, 120, 30);
        b4.addActionListener(this);
        cn.add(b4);

        b5 = new JButton("Power");
        b5.setBounds(610, 500, 120, 30);
        b5.addActionListener(this);
        cn.add(b5);

        b6 = new JButton("Reset");
        b6.setBounds(750, 500, 120, 30);
        b6.addActionListener(this);
        cn.add(b6);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            String s1 = t1.getText();
            String s2 = t2.getText();
            int a = Integer.parseInt(s1);
            int b = Integer.parseInt(s2);
            int res = a + b;
            t3.setText(String.valueOf(res));
        }
        else  if(ae.getSource() == b2){
            String s1 = t1.getText();
            String s2 = t2.getText();
            int a = Integer.parseInt(s1);
            int b = Integer.parseInt(s2);
            int res = a - b;
            t3.setText(String.valueOf(res));
        }
        else  if(ae.getSource() == b3){
            String s1 = t1.getText();
            String s2 = t2.getText();
            int a = Integer.parseInt(s1);
            int b = Integer.parseInt(s2);
            int res = a * b;
            t3.setText(String.valueOf(res));
        }
        else  if(ae.getSource() == b4){
            String s1 = t1.getText();
            String s2 = t2.getText();
            int a = Integer.parseInt(s1);
            int b = Integer.parseInt(s2);
            int res = a / b;
            t3.setText(String.valueOf(res));
        }
        else  if(ae.getSource() == b5){
            String s1 = t1.getText();
            String s2 = t2.getText();
            int a = Integer.parseInt(s1);
            int b = Integer.parseInt(s2);
            int res =(int) Math.pow(a, b);
            t3.setText(String.valueOf(res));
        }
        else  if(ae.getSource() == b6){
            t1.setText("");
            t2.setText("");
            t3.setText("");
        }
    }
}
public class Question16 {
    public static void main(String[] args) {
        new MyCal();
    }

}
