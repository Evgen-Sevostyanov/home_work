package com.geekbrains;

public class Dog extends Animals {
    private final int Max_Run = 500;
    private final int Max_swim = 10;

    @Override
    void run(int lenght) {
        if ((lenght >= 0) && (lenght < 500)) {
            System.out.println("Собака пробежала: " + lenght + " м");
        } else {
            System.out.println("false");
        }
    }
    @Override
    void swim(int lenght) {
        if ((lenght >= 0) && (lenght < 10)) {
            System.out.println("Собака проплыла: " + lenght + " м");
        } else {
            System.out.println("false");
        }
    }
}

