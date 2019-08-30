package ru.tsystems;


import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Main implements Runnable{
    @Override
    public void run() {
        Frame frame = new ru.tsystems.CalculatorFrame();
        frame.setSize(400, 400);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);

            }
        });

        final int WIDTH = 400;
        final int HEIGHT = 400;
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        frame.setBounds((screenSize.width -WIDTH)/2, (screenSize.height-HEIGHT)/2, WIDTH,HEIGHT);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Main()); //new Main() объект класса Main
    }

}
