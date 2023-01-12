package assignment4;

import javax.swing.*;
import java.awt.*;

class MyStudent extends JFrame{
    Container cn;
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10;
    JComboBox c1, c2;
    JRadioButton r1, r2;
    JCheckBox ch1, ch2, ch3;
    JTextField t1, t2, t3, t5, t6,  t8, t9, t10;
    JButton b1, b2;
    ButtonGroup genderGroup;

    MyStudent(){
        cn = getContentPane();
        setTitle("Registration Form");
        setSize(1000,1000);
        setLayout(null);
        setVisible(true);

        // for l1 and t1
        l1 = new JLabel("Name : ");
        l1.setBounds(200, 50, 200, 30);
        cn.add(l1);
        t1 = new JTextField();
        t1.setBounds(500, 50, 200, 30);
        cn.add(t1);

        // for l2 and t2
        l2 = new JLabel("Roll No : ");
        l2.setBounds(200, 100, 200, 30);
        cn.add(l2);
        t2 = new JTextField();
        t2.setBounds(500, 100, 200, 30);
        cn.add(t2);

        // for l3 and t3
        l3 = new JLabel("Regd No : ");
        l3.setBounds(200, 150, 200, 30);
        cn.add(l3);
        t3 = new JTextField();
        t3.setBounds(500, 150, 200, 30);
        cn.add(t3);

        // for l4 and t4
        l4 = new JLabel("Stream :");
        l4.setBounds(200, 200, 200, 30);
        cn.add(l4);
        c1 = new JComboBox();
        c1.setBounds(500, 200, 200, 30);
        c1.addItem("B. Tech");
        c1.addItem("MCA");
        c1.addItem("BE");
        c1.addItem("ME");
        cn.add(c1);


        // for l5 and t5
        l5 = new JLabel("Branch : ");
        l5.setBounds(200, 250, 200, 30);
        cn.add(l5);
        t5 = new JTextField();
        t5.setBounds(500, 250, 200, 30);
        cn.add(t5);

        // for l6 and t6
        l6 = new JLabel("Semester : ");
        l6.setBounds(200, 300, 200, 30);
        cn.add(l6);
        c2 = new JComboBox();
        c2.setBounds(500, 300, 200, 30);
        c2.addItem("1st");
        c2.addItem("2nd");
        c2.addItem("3rd");
        c2.addItem("4th");
        c2.addItem("5th");
        c2.addItem("6th");
        c2.addItem("7th");
        cn.add(c2);

        // for l7 and t7
        l7 = new JLabel("Gender : ");
        l7.setBounds(200, 350, 200, 30);
        cn.add(l7);
        r1 = new JRadioButton("Male");
        r1.setBounds(500, 350, 100, 30);
        cn.add(r1);
        r2 = new JRadioButton("Female");
        r2.setBounds(600, 350, 100, 30);
        cn.add(r2);

        genderGroup = new ButtonGroup();
        genderGroup.add(r1);
        genderGroup.add(r2);




        // for l8 and t8
        l8 = new JLabel("Hobbies : ");
        l8.setBounds(200, 400, 200, 30);
        cn.add(l8);
        ch1 = new JCheckBox("Play");
        ch1.setBounds(500, 400, 70, 30);
        cn.add(ch1);
        ch1 = new JCheckBox("Read");
        ch1.setBounds(570, 400, 70, 30);
        cn.add(ch1);
        ch1 = new JCheckBox("Dance");
        ch1.setBounds(640, 400, 70, 30);
        cn.add(ch1);

        // for l9 and t9
        l9 = new JLabel("Email id : ");
        l9.setBounds(200, 450, 200, 30);
        cn.add(l9);
        t9 = new JTextField();
        t9.setBounds(500, 450, 200, 30);
        cn.add(t9);

        // for l10 and t10
        l10 = new JLabel("Phone No : ");
        l10.setBounds(200, 500, 200, 30);
        cn.add(l10);
        t10 = new JTextField();
        t10.setBounds(500, 500, 200, 30);
        cn.add(t10);

        b1 = new JButton("Submit");
        b1.setBounds(450, 550, 100, 20);
        cn.add(b1);
        b2 = new JButton("Reset");
        b2.setBounds(600, 550, 100, 20);
        cn.add(b2);

    }

}
public class Question14 {
    public static void main(String[] args) {

        new MyStudent();
    }
}
