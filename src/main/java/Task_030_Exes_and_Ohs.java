import java.util.Locale;
// Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be
// case insensitive. The string can contain any char.
public class Task_030_Exes_and_Ohs {
    public static void main(String[] args) {
        String myString = "OooXxxoxx";
        System.out.println(getXO(myString));
    }
    public static boolean getXO(String str) {

        char[] myChar = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            myChar[i] = str.toLowerCase(Locale.ROOT).charAt(i);
        }

        int qty_X = 0; int qty_O = 0;

        for (char c : myChar) {
            if (c == 'x') {
                qty_X++;
            }
            if (c == 'o') {
                qty_O++;
            }
        }
        return qty_O == qty_X;
    }
}
