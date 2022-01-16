package com.geekbrains;

import javax.swing.*;

public class Cal1 extends JFrame {
    public Cal1 () {
        setTitle("Calculator");
        getContentPane().add(new CalculatorPanel());
    }
    public static void main(String[] args) {
     Cal1 frame = new Cal1();
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setBounds(400,200,200,200);
     frame.setVisible(true);
    }
}
