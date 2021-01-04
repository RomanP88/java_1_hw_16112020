package hw1;

public class Main {
    public static void main(String[] args) {                                                               // 1 Задание


        System.out.println();
        byte b = 123;                                                                                          // 2 Задание
        short s = 6851;
        int i = 300458500;
        long l = 5896254121344211122L;
        char c = '\uFFFF';
        float f = 12.586667f;
        double d = 58.451233261633;

        int x = 0;
        boolean z = !(x == 0);



        System.out.println();                                                                                  // 2 Задание
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(c);
        System.out.println(f);
        System.out.println(d);
        System.out.println(z);


        System.out.println();                                                                                  // 3 Задание
        System.out.println(calculate(1.1f, 2.5f, 58.4f, 7.6f));


        System.out.println();                                                                                  // 4 Задание
        System.out.println(task10and20(10,5));


        System.out.println();                                                                                  // 5 Задание
        isPositiveOrNegative(10);

        System.out.println();                                                                                  // 6 Задание
        System.out.println(isNegative(-10));

        System.out.println();                                                                                  // 7 Задание
        greetings("Роман");

        System.out.println();                                                                               // Задание со *
        Main lear = new Main();
        System.out.println("2002 is a leap year : " + lear.isLeapYear(2002));
        System.out.println("2020 is a leap year : " + lear.isLeapYear(2020));
        System.out.println("2000 is a leap year : " + lear.isLeapYear(2000));

    }
    public static float calculate(float a, float b, float c, float d) {                                    // 3 Задание
        return a * (b + (c / d));
    }        // 3 Задание


    public static boolean task10and20(int a, int b) {                                                      // 4 Задание

        return (a + b) >= 10 && (a + b) <= 20;
    }



    public static void isPositiveOrNegative(int x) {                                                       // 5 Задание
        if(x >= 0){
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }


    public static boolean isNegative(int x) {                                                              // 6 Задание

        return !(x >= 0);
    }


    public static void greetings(String name) {                                                            // 7 Задание

        System.out.println("Привет, " + name);
    }

    public boolean isLeapYear(int year) {                                                               // Задание со *

        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }
}
