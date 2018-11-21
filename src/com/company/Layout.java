package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import net.miginfocom.swing.MigLayout;




public class Layout extends JFrame implements ActionListener {

    private JFrame frame;
    private JButton b1;
    private JTextField tf1;

    public Layout() {
        frame = new JFrame("passwordgenerator");
        frame.setSize(500, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new MigLayout("align 50% 50%"));

        b1 = new JButton("Generate a password.");
        tf1 = new JTextField(30);
        //  tf1.setEditable(false);

        b1.addActionListener(this);

        frame.add(b1, "wrap, center");
        frame.add(tf1);


    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1) {
            displayPw();
        }

    }

    private void displayPw() {

        Password pass = new Password();
        tf1.setText(pass.generatePassword(25));

    }

}