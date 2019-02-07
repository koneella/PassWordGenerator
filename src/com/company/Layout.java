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
    private JCheckBox checkSmall;
    private JCheckBox checkBig;
    private JCheckBox checkNum;



    public Layout() {
        frame = new JFrame("passwordgenerator");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new MigLayout("align 50% 50%",
                                        "[]25[]25[]",
                                        "[]10[]"));

        b1 = new JButton("Generate a password.");
        b1.addActionListener(this);

        passwordShow = new JTextField(30);
        passwordShow.setEditable(false);

        checkBig = new JCheckBox();
        checkSmall = new JCheckBox();
        checkNum = new JCheckBox();

        frame.add(b1, "wrap, span, center");
        frame.add(passwordShow, "wrap, span, center");
        frame.add(new JLabel("Big characters"),"");
        frame.add(new JLabel("Small characters"), "");
        frame.add(new JLabel("Numbers"),"wrap");
        frame.add(checkBig, "");
        frame.add(checkSmall, "");
        frame.add(checkNum, "");


        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1 && checkBig.isSelected() ) {
            displayPw(25, true, false, false);
        } else if (e.getSource() == b1 && checkSmall.isSelected()) {
            displayPw(25, false, true, false);
        }else if (e.getSource() == b1 && checkBig.isSelected() && checkSmall.isSelected()) {
            displayPw(25, true, true, false);
        }

    }

    private void displayPw(int len, boolean big, boolean small, boolean numbers) {

        Password pass = new Password();
        passwordShow.setText(pass.generatePassword(len, big, small, numbers));

    }

}