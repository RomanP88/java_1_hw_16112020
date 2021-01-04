package hw2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        System.out.println();


        invertArray();                                                                                                     // 1 ЗАДАНИЕ


        System.out.println();


        fillArray();                                                                                                       // 2 ЗАДАНИЕ


        System.out.println();


        changeArray();                                                                                                     // 3 ЗАДАНИЕ


        System.out.println();


        fillDiagonal();                                                                                                   // 4 ЗАДАНИЕ


        System.out.println();


        maxAndMin();                                                                                                     // 5 ЗАДАНИЕ


        System.out.println();


        test();                                                                                                          // 7 ЗАДАНИЕ



    }




    public static void invertArray() {                                                                                    // 1 ЗАДАНИЕ

        int[] arr = {1, 0, 0, 1, 1, 0, 0, 1, 1};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] -= 1;
            } else if (arr[i] == 0) {
                arr[i] += 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void fillArray() {                                                                                     // 2 ЗАДАНИЕ
        int[] arrR = {0, 1, 2, 3, 4, 5, 6, 7};

        for (int i = 0; i < arrR.length; i++) {
            arrR[i] *= 3;
            System.out.printf("%-4d", arrR[i]);
        }
        System.out.println();

    }

    public static void changeArray() {                                                                                  // 3 ЗАДАНИЕ
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 6)
                arr[i] *= 2;
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void fillDiagonal() {                                                                                  // 4 ЗАДАНИЕ
        int[][] arr = new int[9][9];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j)
                    arr[i][j] = 1;
                else {
                    arr[i][j] = 0;
                }
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void maxAndMin() {                                                                                     // 5 ЗАДАНИЕ
        int[] arr = {4, 58, 31, 111, 25, 2, 78, 55};
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Максимальное значение: " + max);
        System.out.println("Минимальное значение: " + min);
    }


    public static void test() {                                                                                           // 7 ЗАДАНИЕ
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] N = new int[arr.length + 1];
        System.out.println("Массив до сдвига: \n");
        System.out.println(Arrays.toString(arr));
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            N[i + 1] = arr[i];
            arr[i] = N[i];
        }
        System.out.println("Массив после сдвига: \n");
        System.out.println(Arrays.toString(arr));

    }
}
