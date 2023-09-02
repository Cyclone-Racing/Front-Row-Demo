package org.example;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.UIManager;

public class Main {

    static JFrame window = new JFrame("Front Row Demo");

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch(Exception e){
            System.out.println("OS Not Detected");
        };

        window.setLayout(new BorderLayout());
        window.add(HorizontalPanel.instance, BorderLayout.SOUTH);

        // size the window
        int width = 192;
        int height = 144;
        Dimension size = new Dimension(width, height);
        window.setSize(size);
        Dimension resolution144p = new Dimension(192, 144);
        window.setMinimumSize(resolution144p);
        window.setLocationRelativeTo(null);
        window.setExtendedState(JFrame.MAXIMIZED_BOTH);

        window.setVisible(true);
    }
}