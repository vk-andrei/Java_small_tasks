//You need to return a string that looks like a diamond shape when printed on the screen, using asterisk (*) characters.
// Trailing spaces should be removed, and every line must be terminated with a newline character (\n).
// Return null if the input is an even number or negative, as it is not possible to print a diamond of even or negative size.
public class Task_023 {
    public static void main(String[] args) {

        int n = 7;
        System.out.print(print(n));
    }

    private static String print(int n) {     // n = 5     ANSWER =     "  *\n ***\n*****"     " ***\n  *\n"

        if (n % 2 == 0 || n <= 0) return null;
        String z = "*";
        String sp = " ";
        String nt = "\n";
        int k = (int) ((n + 1) / 2);      // 3
        //System.out.println("k = " + k);
        String str = "";

        for (int i = 0; i < k; i++) {
            str += sp.repeat(k - 1 - i) + z.repeat(1 + i * 2) + nt;
        }
        for (int i = k - 1; i > 0; i--) {
            str +=  sp.repeat(k - i) + z.repeat(i * 2 - 1) + nt;
        }

        return str;
    }
}
