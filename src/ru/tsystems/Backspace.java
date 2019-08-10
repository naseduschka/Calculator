package ru.tsystems;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class Backspace implements ActionListener{
    private JTextField textField;


    Backspace(JTextField textField) {
        this.textField=textField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = textField.getText();
        int textLength = text.length();
        if (textLength ==1) {
            if (text.equals("0")) {

            } else {
                textField.setText("0");
            }
        }

         if (textLength>1) {
             String newString = text.substring(0, textLength-1);
             textField.setText(newString);
         }

    }
}
