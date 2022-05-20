public class Task_035_RecursionNumbers {
    public static void main(String[] args) {

        int a = 55;
        int b = 55;
        printNumbers(a, b);

    }

    private static void printNumbers(int a, int b) {
        if (a <= b) {
            printNumbersA_B(a, b);
        } else {
            printNumbersB_A(a, b);
        }
    }

    private static void printNumbersA_B(int a, int b) {
        if (a > b) return;
        System.out.print(" " + a++);
        printNumbersA_B(a, b);
    }

    private static void printNumbersB_A(int a, int b) {
        if (a < b) return;
        System.out.print(" " + a--);
        printNumbersB_A(a, b);
    }


}

