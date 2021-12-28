package com.geekbrains;

public class Home_work_3 {
    public static void main(String[] args) {
        int[] mass = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1}; // первое задание
        int maxMass = mass.length;
        for (int i = 0; i < maxMass; i++)
            if (mass[i] == 1) {
                mass[i] = 0;
            } else mass[i] = 1;
        for (int i = 0; i < maxMass; i++) {
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        int[] arr = new int[101]; // второе задание
        for (int i = 0; i < 101; i++) {
            arr[i] = i;
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        int[] mass1 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}; // третье задание
        int maxMass1 = mass1.length;
        for (int i = 0; i < maxMass1; i++) {
            if (mass1[i] < 6)
                mass1[i] = mass1[i] * 2;
            System.out.print(mass1[i] + " ");
            System.out.println();
        }
        int[][] arr1 = new int[4][4]; //четвертое задание
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    arr1[i][j] = 1;
                }
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        printArrayInConsole(retLenArr(5,4)); // пятое задание
    }
    public static int[] retLenArr (int len, int initialValue) {
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++){
            arr[i] = initialValue;
        }
        return arr;
    }
    public static void printArrayInConsole(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
        System.out.println();
    }
}
