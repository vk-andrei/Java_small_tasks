package tic_tac_toe;

import java.util.Random;
import java.util.Scanner;

public class Start {

    public static char[][] map;
    public static final int SIZE = 3;
    public static final int DOTS_TO_WIN = 3;
    public static final char DOT_EMPTY = '•';              // alt + 7
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static Scanner SCAN = new Scanner(System.in);
    public static Random RAND = new Random();


    public static void main(String[] args) {

        initMap();                                         // INITIALIZATION of MAP
        printMap();                                        // OUTPUT of MAP
        humanTurn();
        printMap();
        humanTurn();
        printMap();
        terminatorTurn();
        printMap();


    }

    private static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() {
        System.out.print(" ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(" " + (i + 1));
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void humanTurn() {
        int x, y;
        do {
            System.out.print("Input x & y: ");
            x = SCAN.nextInt() - 1;
            y = SCAN.nextInt() - 1;
        } while (!IsValidCell(x, y));
        map[y][x] = DOT_X;
    }

    private static boolean IsValidCell(int x, int y) {          // CHECKING for available place for turn
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }

    private static void terminatorTurn() {
        int x, y;
        do {
            x = RAND.nextInt(SIZE);
            y = RAND.nextInt(SIZE);
        } while (!IsValidCell(x, y));
        System.out.println("Terminator's turn was in: " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;

    }


}





