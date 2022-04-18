public class Task_028_SudokuValidator {
    public static void main(String[] args) {
        int[][] sudoku = new int[][] {
                /*{5, 3, 4, 6, 7, 8, 9, 1, 2},     //  sum 45
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}*/
                {1, 3, 2, 5, 7, 9, 4, 6, 8},
                {4, 9, 8, 2, 6, 1, 3, 7, 5},
                {7, 5, 6, 3, 8, 4, 2, 1, 9},
                {6, 4, 3, 1, 5, 8, 7, 9, 2},
                {5, 2, 1, 7, 9, 3, 8, 4, 6},
                {9, 8, 7, 4, 2, 6, 5, 3, 1},
                {2, 1, 4, 9, 3, 5, 6, 8, 7},
                {3, 6, 5, 8, 1, 7, 9, 2, 4},
                {8, 7, 9, 6, 4, 2, 1, 3, 5}
        };
        System.out.println(check(sudoku));
    }

    private static boolean check (int[][] sud) {
        int sumX = 0; int sumY = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (sud[i][j] == 0) return false;
                if (sud[j][i] == 0) return false;
                for (int k = 0; k < 8 ; k++) {
                    if ((sud[i][k] == sud[i][k + 1]) ||  (sud[j][k] == sud[j][k + 1])) {
                        System.out.println("something equal:" + sud[i][k] + " == " + sud[i][k + 1] + " or "+ sud[j][k] + " == " + sud[j][k + 1]);
                        return false;
                    }
                }
                sumX += sud[i][j];
                sumY += sud[j][i];
            }
        System.out.print  ("Row    " + (i+1) + ": " + sumX + "  ");
        System.out.println("Column " + (i+1) + ": " + sumX);
        if (sumX != 45) {
            System.out.println("not 45!!!" + sumX);
            return false;
        }
        if (sumY != 45) {
            System.out.println("not 45555!!!  " + sumY);
            return false;
        }

        sumX = 0; sumY = 0;
        }
        return true;
    }
}