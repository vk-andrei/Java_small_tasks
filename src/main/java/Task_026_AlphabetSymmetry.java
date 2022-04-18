import java.util.Arrays;
import java.util.Locale;

public class Task_026_AlphabetSymmetry {
    public static void main(String[] args) {

        String[] arr = new String[] {"IAMDEFANDJKL" ,"thedefgh" ,"xyzDEFghijabc"};  // 6 5 7
        System.out.println(Arrays.toString(solve(arr)));
    }

    private static int[] solve(String[] arr) {

        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();   // length = 26,   0...25
        int[] arrQty = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            char[] a = arr[i].toLowerCase(Locale.ROOT).toCharArray();
            int count = 0;

            for (int j = 0; j < a.length; j++) {
                if (j == 26) break;
                if (a[j] == alphabet[j]) {
                    count++;
                }
            }
            arrQty[i] = count;
        }

    return arrQty;
    }
}