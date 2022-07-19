package GUI;

import java.io.*;
import java.nio.charset.MalformedInputException;

import javax.swing.*;

public class JFileChooserTest {
    public static void main(String[] args) throws IOException {
        JFileChooserDemo application = new JFileChooserDemo();
        application.setSize(500,500);
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setVisible(true);
    }
}
