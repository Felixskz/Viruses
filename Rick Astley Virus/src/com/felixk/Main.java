/**
 * There are no rights on this document (yet)
 *
 * @author : @felixkuang Tiktok
 */

package com.felixk;

import java.awt.*;
import javax.swing.*;
import java.util.Random;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Main {

    /*EDITS*/

    static int delayMilliseconds = 500;

    /**/

    JFrame frame;
    JLabel label;

    final int WIDTH = 200, HEIGHT = 100;
    final int LABEL_WIDTH = 20, LABEL_HEIGHT = 10;

    Font labelFont = new Font("Default", Font.PLAIN, 20);

    static String lyrics = "We're no strangers to love, " +
            "You know the rules and so do I, " +
            "A full commitment's what I'm thinking of, " +
            "You wouldn't get this from any other guy, " +
            "I just wanna tell you how I'm feeling, " +
            "Gotta make you understand, " +
            "Never gonna give you up, " +
            "Never gonna let you down, " +
            "Never gonna run around and desert you, " +
            "Never gonna make you cry, " +
            "Never gonna say goodbye, " +
            "Never gonna tell a lie and hurt you, " +
            "We've known each other for so long, " +
            "Your heart's been aching but you're too shy to say it, " +
            "Inside we both know what's been going on, " +
            "We know the game and we're gonna play it, " +
            "And if you ask me how I'm feeling, " +
            "Don't tell me you're too blind to see, " +
            "Never gonna give you up, " +
            "Never gonna let you down, " +
            "Never gonna run around and desert you, " +
            "Never gonna make you cry, " +
            "Never gonna say goodbye, " +
            "Never gonna tell a lie and hurt you, " +
            "Never gonna give you up, " +
            "Never gonna let you down, " +
            "Never gonna run around and desert you, " +
            "Never gonna make you cry, " +
            "Never gonna say goodbye, " +
            "Never gonna tell a lie and hurt you, " +
            "We've known each other for so long, " +
            "Your heart's been aching but you're too shy to say it, " +
            "Inside we both know what's been going on, " +
            "We know the game and we're gonna play it, " +
            "I just wanna tell you how I'm feeling, " +
            "Gotta make you understand, " +
            "Never gonna give you up, " +
            "Never gonna let you down, " +
            "Never gonna run around and desert you, " +
            "Never gonna make you cry, " +
            "Never gonna say goodbye, " +
            "Never gonna tell a lie and hurt you, " +
            "Never gonna give you up, " +
            "Never gonna let you down, " +
            "Never gonna run around and desert you, " +
            "Never gonna make you cry, " +
            "Never gonna say goodbye, " +
            "Never gonna tell a lie and hurt you, " +
            "Never gonna give you up, " +
            "Never gonna let you down, " +
            "Never gonna run around and desert you, " +
            "Never gonna make you cry, " +
            "Never gonna say goodbye... ";

    static ArrayList<String> lyricsList = listify(lyrics);

    public Main(String text) {

        frame = new JFrame();
        frame.setTitle("");

        frame.setResizable(false);
        frame.pack();
        frame.setSize(WIDTH, HEIGHT);
        frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

        Random r = new Random();
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        int x = r.nextInt((int) d.getWidth()-WIDTH);
        int y = r.nextInt((int) d.getHeight()-HEIGHT);
        frame.setLocation(x, y);

        label = new JLabel(text, SwingConstants.CENTER);
        label.setBounds((WIDTH-LABEL_WIDTH)/2, (HEIGHT-LABEL_HEIGHT)/2,
                LABEL_WIDTH, LABEL_HEIGHT);
        label.setFont(labelFont);

        frame.add(label);
        frame.setVisible(true);


    }

    public static ArrayList<String> listify(String s) {
        ArrayList<String> list = new ArrayList<>();
        int SOW = 0;
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (c.equals(' ')) {
                list.add(s.substring(SOW, i));
                SOW = i+1;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        while (true) {
            for (String s : lyricsList) {
                try {
                    new Main(s);
                    TimeUnit.MILLISECONDS.sleep(delayMilliseconds);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
