public class Task_028_SudokuValidator {
    public static void main(String[] args) {
        int[][] sudoku = new int[][] {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},     //  sum 45
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };
        System.out.println(check(sudoku));
    }

    private static boolean check (int[][] sud) {
        int sumX = 0; int sumY = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (sud[i][j] == 0) return false;
                sumX += sud[i][j];
            }
        if (sumX != 45) return false;
        }




        return true;
    }
}
