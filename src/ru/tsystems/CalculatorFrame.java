package ru.tsystems;

import javax.swing.*;
import java.awt.*;

public class CalculatorFrame extends JFrame {

    private JTextField textField;
    private JButton button0;
    private JButton button1;
    private JButton backspace;


    CalculatorFrame() {
        super();

        this.setLayout(new GridLayout(5, 4, 10, 10));

        textField = new JTextField();
        textField.setEditable(false);
        this.add(textField);
        textField.setText("0");
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        textField.setFont(new Font("Consolas", Font.BOLD, 26));


        button0 = new JButton("0");
        this.add(button0);

        button1 = new JButton("1");
        this.add(button1);

        backspace = new JButton("<");
        this.add(backspace);



        Button0 pressButton0 = new Button0(textField);
        button0.addActionListener(pressButton0);

        Button1 pressButton1 = new Button1(textField);
        button1.addActionListener(pressButton1);

        Backspace pressbackspace = new Backspace(textField);
        backspace.addActionListener(pressbackspace);

    }
}