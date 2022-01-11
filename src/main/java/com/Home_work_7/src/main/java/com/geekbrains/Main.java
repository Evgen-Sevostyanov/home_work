package com.geekbrains;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int action;
        Cat[] allCats = new Cat[4];
        allCats[0] = new Cat("Шебби", 5, false);
        allCats[1] = new Cat("Муся", 10, false);
        allCats[2] = new Cat("Дуся", 15, false);
        allCats[3] = new Cat("Рыжик", 20, false);

        Plate plate = new Plate(51);
        plate.info();
        for (Cat allCat : allCats) {
            if (!allCat.fullness && allCat.appetite < plate.food) {
                allCat.eat(plate);
                allCat.fullness = true;
                System.out.println("Котик " + allCat.name + " покушал!");
            } else {
                System.out.println("Котик " + allCat.name + " не поел!");
            }
        }
        plate.info();
        System.out.println("Сколько грамм вискаса добавить еще в миску?");
        action = sc.nextInt();
        plate.increaseFood(action);
        plate.info();
    }
}
