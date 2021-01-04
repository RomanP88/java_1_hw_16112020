package hw3;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner sc;
    static Random random;

    public static void main(String[] args) {

        //  theGuessNumber();

        int [][] arr = new int[2][2];
        arr [0][0]= 1;
        arr [0][1]= 2;
        arr [1][0]= 3;
        arr [1][1]= 4;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]);

            }
            System.out.println();
        }







    }


    public static void theGuessNumber(){
        sc = new Scanner(System.in);
        random = new Random();

        do {

            System.out.println("ИГРА: \"Угадать число\"");

            int guessNumber = random.nextInt(10);
            int userNumber = 0;
            int count = 0;


            while (count < 3 && userNumber != guessNumber) {
                System.out.println("Угадай от о до 9");

                userNumber = sc.nextInt();

                if (userNumber > guessNumber) {
                    System.out.println("Загаданное число меньше");
                    count++;

                } else if (userNumber < guessNumber){
                    System.out.println("Загаданное число больше");
                    count++;
                }

            }
            if (userNumber == guessNumber) {
                System.out.println(" Вы победили!\n" + "Правильный ответ - " + guessNumber);

            }
            System.out.println();
            System.out.println("Продолжить игру ? YES - 1, NO - 0");


        } while (sc.nextInt() == 1) ;

    }
}
