package GUI;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;


public class TextFieldFrame extends JFrame {

    private final JTextField textfield1;
    private final JTextField textfield2;
    private final JTextField textfield3;
    private final JPasswordField passwordField;

    public TextFieldFrame() {
        super("Testing JTextField and JPasswordField");
        setLayout(new FlowLayout());

        textfield1 = new JTextField(10);
        add(textfield1);

        textfield2 = new JTextField("Enter text here");
        add(textfield2);

        textfield3 = new JTextField("Uneditable text field", 21);
        textfield3.setEditable(false);
        add(textfield3);

        passwordField = new JPasswordField("Hidden text");
        add(passwordField);

        TextFieldHander handler = new TextFieldHander();
        textfield1.addActionListener(handler);
        textfield2.addActionListener(handler);
        textfield3.addActionListener(handler);
        passwordField.addActionListener(handler);
        
    }

    private class TextFieldHander implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            String string = "";

            if(event.getSource() == textfield1) {
                string = String.format("textField1: %s", event.getActionCommand());
            }

            else if(event.getSource() == textfield2) {
                string = String.format("textField2: %s", event.getActionCommand());
            }

            else if(event.getSource() == textfield3) {
                string = String.format("textField3: %s", event.getActionCommand());
            }

            else if(event.getSource() == passwordField) {
                string = String.format("passwordField: %s", event.getActionCommand());
            }
            
            JOptionPane.showMessageDialog(null, string);

        }
    }    
} 