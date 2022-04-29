import java.util.Arrays;
// Given an array of integers, find the one that appears an odd number of times.
// There will always be only one integer that appears an odd number of times.
public class Task_032_Find_the_odd_int {
    public static void main(String[] args) {

        int[] a = new int[]{1, 2, 2, 3, 3, 3, 4, 3, 3, 3, 2, 2, 1};
        System.out.println("Odd number of times: " + findIt(a));
    }

    private static int findIt(int[] a) {
/* ------------------- MY DECISION ------------------------------
        System.out.println(Arrays.toString(a));
        boolean[] countedItems = new boolean[a.length];
        Arrays.fill(countedItems, false);
        System.out.println(Arrays.toString(countedItems));

        int counter;
        for (int i = 0; i < a.length; i++) {

            if (countedItems[i] == true) {
                continue;
            }
            counter = 1;
            for (int j = i; j < a.length - 1; j++) {
                if (a[i] == a[j + 1]) {
                    counter++;
                    countedItems[j + 1] = true;
                }
            }
            System.out.println("a[" + i + "]: " + a[i] + " - " + counter + " times");
            if (counter % 2 != 0) {
                return a[i];
            }
        }
        return -1;
    } -------------------------W T F ????   HOW IT WORKS------------------- */
        int xor = 0;

        for (int i = 0; i < a.length; i++) {
            xor = xor ^ a[i];
        }
            return xor;
        }



}
