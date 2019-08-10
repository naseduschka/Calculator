package ru.tsystems;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



public class Button1 implements ActionListener {
    String buttonNumber;

    private JTextField textField;


    Button1(JTextField textField) {
        this.textField = textField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = textField.getText();
        if (text.equals("0")) {
            textField.setText(buttonNumber);
        } else {
            text = text + buttonNumber;
            textField.setText(text);
        }
    }
}
