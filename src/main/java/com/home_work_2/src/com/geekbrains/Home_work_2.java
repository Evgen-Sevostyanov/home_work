package com.geekbrains;

    public class Home_work_2 {
        public static void main(String[] args) {
            System.out.println(method1(25, 8));
            method2(10);
            System.out.println(method3(-1));
            method4("Евгений" , 5);
            System.out.println(method5(2019));
        }

        public static boolean method1(int a, int b) {
            int sum = a + b;
            if (sum > 10 && sum <= 20)
                return true;
            else
                return false;
        }

        static void method2(int a) {
            if (a >= 0)
                System.out.println("Число " + a + " положительное");
            else
                System.out.println("Число " + a + " отрицательное");
        }
        public static boolean method3(int a) {
            if (a < 0)
                return true;
            return false;
        }
        public static void method4(String Overlord, int m) {
            for (int i = 1; i <= m; i++) {
                System.out.println("[" + i + "]" + " " + Overlord);
            }
        }
        private static boolean method5(int x) {
            return x % 4 == 0 && x % 100 != 0 || x % 400 == 0;
        }
    }
}
