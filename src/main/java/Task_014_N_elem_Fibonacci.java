public class Task_014_N_elem_Fibonacci {
    public static long fib(int n) {

        // [1 2 3 4 5 6  7 8  9..... ]
        // [1 1 2 3 5 8 13 21 34 .....]
        long fibon1 = 1;
        long fibon2 = 1;
        long fibon = 0;
        if (n <= 3) return 1;
        for (int i = 3; i <= n; i++) {
            fibon = fibon1 + fibon2;
            fibon1 = fibon2;
            fibon2 = fibon;
        }
        // System.out.println("Fibonacci [" + n + "]: " + fibon);
        return fibon;
    }
    public static void main(String[] args) {

        int n = 10;
        System.out.println("Fibonacci [" + n + "]: " + fib(n));
    }

}
