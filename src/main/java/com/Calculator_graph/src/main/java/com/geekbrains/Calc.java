package com.geekbrains;

import javax.swing.*;

public class Calc extends JFrame {
    public Calc() {
        setTitle("Calculator");
        getContentPane().add(new CalculatorPanel());
    }
    public static void main(String[] args) {
        Calc frame = new Calc();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(400,200,200,200);
        frame.setVisible(true);
    }
}
