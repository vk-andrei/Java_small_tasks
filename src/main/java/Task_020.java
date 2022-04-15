//An ATM has banknotes of nominal values 10, 20, 50, 100, 200 and 500 dollars. You can consider that there is a large
// enough supply of each of these banknotes. You have to write the ATM's function that determines the minimal number
// of banknotes needed to honor a withdrawal of n dollars, with 1 <= n <= 1500.
public class Task_020 {
    public static void main(String[] args) {

        int n = 1380;
        System.out.println("Quantity banknotes:" + solve2(n));
    }

    private static int solve2(int n) {

        int[] notes = new int[] {500, 200, 100, 50, 20, 10};
        int q = 0; // quantity of banknotes
        for (int note : notes) {
            q = q + n / note;
            n = n % note;
        }
        return n == 0 ? q : -1;
    }
/*
    private static int solve1(int n) {
        int d1 = n / 500;
        int d2 = (n - d1 * 500) / 200;
        int d3 = (n - d1 * 500 - d2 * 200) / 100;
        int d4 = (n - d1 * 500 - d2 * 200 - d3 * 100) / 50;
        int d5 = (n - d1 * 500 - d2 * 200 - d3 * 100 - d4 * 50) / 20;
        int d6 = (n - d1 * 500 - d2 * 200 - d3 * 100 - d4 * 50 - d5 * 20) / 10;

        int remain = n - (d1 * 500 + d2 * 200 + d3 * 100 + d4 * 50 + d5 * 20 + d6 * 10);
        if (remain > 0) return -1;

        System.out.println("500: " + d1);
        System.out.println("200: " + d2);
        System.out.println("100: " + d3);
        System.out.println("50: " + d4);
        System.out.println("20: " + d5);
        System.out.println("10: " + d6);

        return d1 + d2 + d3 + d4 + d5 + d6;
    }*/
}
