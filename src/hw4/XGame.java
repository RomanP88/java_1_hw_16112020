package hw4;

import java.util.Random;
import java.util.Scanner;

public class XGame {
    static final int SIZE = 3;
    static final int DOTS_TO_WIN = 3;
    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static final char DOT_EMPTY = '.';

    static char[][] map;


    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();


    public static void main(String[] args) {
        initMap();
        printMap();


        while (true) {

            humanTurn();
            printMap();

            if (chek(DOT_X, DOTS_TO_WIN)) {
                System.out.println("Победил человек");
                break;
            }
            if (isFull()) {
                System.out.println("НИЧЬЯ");
                break;
            }

            aiTurn();
            printMap();

            if (chek(DOT_O, DOTS_TO_WIN)) {
                System.out.println("Победил Компьютер");
                break;
            }
            if (isFull()) {
                System.out.println("НИЧЬЯ");
                break;
            }
        }
        System.out.println("Игра закончена");
    }



    static void initMap () {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {

                map[i][j] = DOT_EMPTY;

            }

        }
    }

    static void printMap () {
        System.out.print("  ");

        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
        }

        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");

            for (int j = 0; j < SIZE; j++) {

                System.out.printf("%c ", map[i][j]);

            }
            System.out.println();
        }
    }

    static void humanTurn () {

        int x;
        int y;

        do {
            System.out.println("Input coordinate x y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));

        map[y][x] = DOT_X;
    }

    static void aiTurn () {
        int x;
        int y;

        do {
            System.out.println("Input coordinate x y");
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);

        } while (!isCellValid(x, y));

        map[y][x] = DOT_O;
    }

    public static boolean isCellValid ( int x, int y){
        if (y < 0 || x < 0 || y >= SIZE || x >= SIZE) {
            return false;
        }
        return (map[y][x] == DOT_EMPTY);
    }
    public static boolean isFull () {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }


    public static boolean checkWin(int y1, int x1, int y2, int x2, char c, int dotsToWin) {
        if (x1 + x2 * (dotsToWin - 1) > SIZE - 1 || y1 + y1 * (dotsToWin - 1) > SIZE - 1 ||
                y1 + y1 * (dotsToWin - 1) < 0) {
            return false;

        }
        for (int i = 0; i < dotsToWin; i++) {
            if (map[y1 + i * y2][x1 + i * x2] != c) {
                return false;
            }

        }
        return true;
    }

    public static boolean chek(char c, int dotsToWin) {

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (checkWin(i, j, 0, 1, c, dotsToWin)||
                        checkWin(i, j, 1, 0, c, dotsToWin) ||
                        checkWin(i, j, 1, 1, c, dotsToWin) ||
                        checkWin(i, j, -1, 2, c, dotsToWin)) {
                    return true;
                }
            }
        }
        return false;
    }

}

