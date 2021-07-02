package com.felixk;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

public class Main {

    /*EDITS*/

    int multiplier = 2;

    /**/

    JFrame frame;
    JLabel label;

    final int WIDTH = 200, HEIGHT = 100;
    final int LABEL_WIDTH = 20, LABEL_HEIGHT = 10;

    Font labelFont = new Font("Default", Font.PLAIN, 20);

    WindowAdapter REOPEN = new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent windowEvent) {
            for (int i = 0; i < multiplier; i++) {
                new Main();
            }
        }
    };

    public Main() {

        frame = new JFrame();
        frame.setTitle("lol");

        frame.setResizable(false);
        frame.pack();
        frame.setSize(WIDTH, HEIGHT);

        Random r = new Random();
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        int x = r.nextInt((int) d.getWidth()-WIDTH);
        int y = r.nextInt((int) d.getHeight()-HEIGHT);
        frame.setLocation(x, y);

        frame.addWindowListener(REOPEN);

        label = new JLabel("lol", SwingConstants.CENTER);
        label.setBounds((WIDTH-LABEL_WIDTH)/2, (HEIGHT-LABEL_HEIGHT)/2,
                LABEL_WIDTH, LABEL_HEIGHT);
        label.setFont(labelFont);

        frame.add(label);
        frame.setVisible(true);


    }

    public static void main(String[] args) { new Main();}
}
