package ru.tsystems;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class Button0 implements ActionListener {
    private JTextField textField;


    Button0(JTextField textField) {
        this.textField = textField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = textField.getText();
        if (text.equals("0")) {

        } else {
            text = text + "0";
            textField.setText(text);
        }
    }
}
