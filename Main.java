package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class Main implements ActionListener {

    private JFrame f, f1;
    private JPanel p, p1;
    private JButton b1,b2, b3,b4,b5,b6,b7,b8;
    private JLabel accountInfoLabel;
    private JLabel passwordLabel;
    private JTextField accountInfoTextField;
    private JPasswordField passwordTextField;
    private Scanner scanFile, scanFileForAccountInfo;




    public Main()
    {
      gui();


     }


    public void gui() {


        f = new JFrame("ATM Machine");
        f.setVisible(true);
        f.setSize(600, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p = new JPanel(new GridBagLayout());

        GridBagConstraints g = new GridBagConstraints();

        p.setBackground(Color.lightGray);


        b1 = new JButton("Login");
        b2 = new JButton("Deposit");
        b3 = new JButton("Withdraw");
        b4 = new JButton("Check Balance");
        b5 = new JButton("Make Transfer");
        b6 = new JButton("Change Password");
        b7 = new JButton("Logout");
        b8 = new JButton("Close Program");

        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == b8)
                    System.exit(0);
            }
        });

        b1.addActionListener(new ActionListener() {
                                 @Override
                                 public void actionPerformed(ActionEvent e) {

                                     f = new JFrame();
                                     f.setVisible(true);
                                     f.setSize(600, 400);
                                     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


                                     p1 = new JPanel(new GridBagLayout());

                                     GridBagConstraints g = new GridBagConstraints();
                                     g.insets = new Insets(15, 15, 15, 15);

                                     p1.setBackground(Color.lightGray);

                                     g.gridx = 0;
                                     g.gridy = 0;
                                     p1.add(b2, g);

                                     g.gridx = 2;
                                     g.gridy = 0;
                                     p1.add(b3, g);

                                     g.gridx = 0;
                                     g.gridy = 1;
                                     p1.add(b4, g);

                                     g.gridx = 2;
                                     g.gridy = 1;
                                     p1.add(b5, g);

                                     g.gridx = 0;
                                     g.gridy = 2;
                                     p1.add(b6, g);

                                     g.gridx = 2;
                                     g.gridy = 2;
                                     p1.add(b7, g);

                                     f.add(p1);


                                 }
                             }
        );

        accountInfoLabel = new JLabel("Account Number:");
        passwordLabel = new JLabel("Password:");

        accountInfoTextField = new JTextField(25);
        passwordTextField = new JPasswordField(25);

        g.insets = new Insets(10, 10, 10, 10);
        g.gridx = 0;
        g.gridy = 0;
        p.add(accountInfoLabel, g);

        g.gridx = 1;
        g.gridy = 0;
        p.add(accountInfoTextField, g);

        g.gridx = 0;
        g.gridy = 2;
        p.add(passwordLabel, g);

        g.gridx = 1;
        g.gridy = 2;
        p.add(passwordTextField, g);

        g.gridx = 1;
        g.gridy = 4;
        p.add(b1, g);

        g.gridx = 1;
        g.gridy = 5;
        p.add(b8, g);

        f.add(p);
    }

    public static void main(String[] args) {

        new Main();

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {

    }
}