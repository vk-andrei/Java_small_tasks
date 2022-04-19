import java.util.Arrays;

public class Task_028_SudokuValidator {

    final public static int SUD_SIZE = 9;

    public static void main(String[] args) {
        int[][] sudoku = new int[][]{
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {2, 3, 4, 5, 6, 7, 8, 9, 1},
                {3, 4, 5, 6, 7, 8, 9, 1, 2},
                {4, 5, 6, 7, 8, 9, 1, 2, 3},
                {5, 6, 7, 8, 9, 1, 2, 3, 4},
                {6, 7, 8, 9, 1, 2, 3, 4, 5},
                {7, 8, 9, 1, 2, 3, 4, 5, 6},
                {8, 9, 1, 2, 3, 4, 5, 6, 7},
                {9, 1, 2, 3, 4, 5, 6, 7, 8}
        };
        System.out.println(check(sudoku));
    }

    private static boolean check(int[][] sud) {
        /// CHECKING ROWS
        for (int i = 0; i < SUD_SIZE; i++) {
            for (int j = 0; j < SUD_SIZE; j++) {
                if (sud[i][j] == 0) return false;    // checking for ZERO
                if (sud[j][i] == 0) return false;
                int num = sud[i][j];
                for (int k = j + 1; k < SUD_SIZE; k++) {
                    if (num == sud[i][k]) {
                        System.out.println(num + " == " + sud[i][k] + " row = " + i);
                        System.out.println(Arrays.toString(sud[i]));
                        System.out.println(false);
                        return false;
                    }
                }
            }
        }
        /// CHECKING COLUMNS
        for (int i = 0; i < SUD_SIZE; i++) {
            for (int j = 0; j < SUD_SIZE; j++) {

                int num = sud[i][j];
                for (int k = i + 1; k < SUD_SIZE; k++) {
                    if (num == sud[k][j]) {
                        System.out.println(num + " == " + sud[k][j] + " col = " + j);
                        System.out.println(false);
                        return false;

                    }
                }
            }
        }
        /// CHECKING BLOCKS (3 x 3)
        int sum = 0;
        for (int x = 0; x < SUD_SIZE; x += 3) {
            for (int y = 0; y < SUD_SIZE; y += 3) {

                for (int i = x; i < x + 3; i++) {
                    for (int j = y; j < y + 3; j++) {

                        sum += sud[i][j];
                    }
                }
                System.out.print(sum + " ");
                if (sum != 45) return false;
                sum = 0;
            }
            System.out.println();
        }
        return true;
    }
}