import java.util.Arrays;
//You are given the array / tuple (listField) of two strings of equal length. Each the string contains
// "$->" and "<-P"(knight with lance) respectively. The knights move towards each other and they can only take
// simultaneous steps of length vKnightLeft and vKnightRight. When the index of ">" is equal or more than the
// index of "<", return the array / tuple representing the knights' positions.
public class Task_031_KingdomsJousting {
    public static void main(String[] args) {

        String[] listField = new String[]{"$->    ", "    <-P"};

        int vKnightLeft = 0;
        int vKnightRight = 0;

        System.out.println(Arrays.toString(joust(listField, vKnightLeft, vKnightRight)));
    }

    private static String[] joust(String[] listField, int vKnightLeft, int vKnightRight) {

        StringBuilder knightL = new StringBuilder(listField[0]);
        StringBuilder knightR = new StringBuilder(listField[1]);

        if (vKnightLeft == 0 && vKnightRight == 0) {
            return new String[]{knightL.toString(), knightR.toString()};
        }

        System.out.println("velocity Left = " + vKnightLeft);
        System.out.println("velocity Right = " + vKnightRight);

        System.out.println(knightL);
        System.out.println(knightR);
        System.out.println("[" + knightL + ", " + knightR + "]");
        int l = knightL.indexOf(">");
        int r = knightR.indexOf("<");
        System.out.println("> = " + l);
        System.out.println("< = " + r);

        if (l < r) {
            do {
                for (int i = 0; i < vKnightLeft; i++) {
                    knightL.insert(0, " ");
                    knightL.deleteCharAt(knightL.length() - 1);
                }
                l = knightL.indexOf(">");
                for (int i = 0; i < vKnightRight; i++) {
                    knightR.append(" ");
                    knightR.deleteCharAt(0);
                }
                r = knightR.indexOf("<");
            } while ( l < r);
        }

        return new String[]{knightL.toString(), knightR.toString()};
    }
}