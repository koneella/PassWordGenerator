package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import net.miginfocom.swing.MigLayout;
import sun.management.snmp.jvminstr.JvmThreadInstanceEntryImpl;


public class Layout extends JFrame implements ActionListener {

    private JFrame frame;
    private JButton b1;
    private JTextField passwordShow;
    private JLabel bigCheckText;
    private JCheckBox checkSmall;
    private JCheckBox checkBig;



    public Layout() {
        frame = new JFrame("passwordgenerator");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new MigLayout("align 50% 50%"));

        b1 = new JButton("Generate a password.");
        b1.addActionListener(this);

        passwordShow = new JTextField(30);
        passwordShow.setEditable(false);

        bigCheckText = new JLabel("Big characters");
        checkBig = new JCheckBox();


        frame.add(b1, "wrap, center");
        frame.add(passwordShow, "wrap");
        frame.add(bigCheckText, "wrap");
        frame.add(checkBig);


        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1 && checkBig.isSelected() ) {
            displayPw(25, true, false);
        } else if (e.getSource() == b1 && checkBig.isSelected()) {
            displayPw(25, false, true);
        }

    }

    private void displayPw(int len, boolean big, boolean small ) {

        Password pass = new Password();
        passwordShow.setText(pass.generatePassword(len, big, small));

    }

}