package tic_tac_toe;

import java.util.Random;
import java.util.Scanner;

public class Start_var_01 {

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

        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("HUMAN WINS!");
                break;
            }
            if (isMapFull()) {
                System.out.println("It's a DRAW!");
                break;
            }

            terminatorTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("TERMINATOR WINS!");
                break;
            }
            if (isMapFull()) {
                System.out.println("It's a DRAW!");
                break;
            }
        }
        System.out.println("GAME OVER!");
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
        char xSymb = 'x'; char ySymb = 'y';
        do {
            System.out.println("Input x & y: ");
            x = getNumFromScanner(xSymb) - 1;
            y = getNumFromScanner(ySymb) - 1;
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

    private static boolean checkWin(char symbol) {
        int winX = 0;
        int winY = 0;
        int diag1 = 0;
        int diag2 = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == symbol) {
                    winX++;
                }
                if (map[j][i] == symbol) {
                    winY++;
                }
                if (i == j && map[i][j] == symbol) {
                    diag1++;
                }
                if (i + j == map.length - 1 && map[i][j] == symbol) {
                    diag2++;
                }
            }
            if (winX == DOTS_TO_WIN || winY == DOTS_TO_WIN || diag1 == DOTS_TO_WIN || diag2 == DOTS_TO_WIN) return true;
            winX = 0;
            winY = 0;
        }
        return false;
    }

    private static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    private static int getNumFromScanner (char symb) {
        int number;
        while (true) {
            System.out.print(symb + "?: ");
            if (SCAN.hasNextInt()) {
                return SCAN.nextInt();
            }
            System.out.println(SCAN.next() + " - not a number!");
        }
    }
}