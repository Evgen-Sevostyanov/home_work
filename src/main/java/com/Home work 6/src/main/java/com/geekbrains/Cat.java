package com.geekbrains;

public class Cat extends Animals {
    private final int Max_Run = 200;
    private final int Max_Swim = 0;
    @Override
    void run (int lenght) {
        if ((lenght >= 0) && (lenght <= Max_Run)) {
            System.out.println("Кот пробежал: " + lenght + " м");
        } else {
            System.out.println("false");
        }
    }
    @Override
    void swim(int lenght) {
        System.out.println("Кот не умеет плавать ");
    }
}
