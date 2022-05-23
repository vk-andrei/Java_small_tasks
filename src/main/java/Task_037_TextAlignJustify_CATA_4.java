import java.util.Arrays;

public class Task_037_TextAlignJustify_CATA_4 {
    public static void main(String[] args) {

        String text1 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum sa"
                + "gittis dolor mauris, at elementum ligula tempor eget. In quis rhoncus nunc, at aliquet orci. Fusc"
                + "e at dolor sit amet felis suscipit tristique. Nam a imperdiet tellus. Nulla eu vestibulum urna. V"
                + "ivamus tincidunt suscipit enim, nec ultrices nisi volutpat ac. Maecenas sit amet lacinia arcu, no"
                + "n dictum justo. Donec sed quam vel risus faucibus euismod. Suspendisse rhoncus rhoncus felis at f"
                + "ermentum. Donec lorem magna, ultricies a nunc sit amet, blandit fringilla nunc. In vestibulum vel"
                + "it ac felis rhoncus pellentesque. Mauris at tellus enim. Aliquam eleifend tempus dapibus. Pellent"
                + "esque commodo, nisi sit amet hendrerit fringilla, ante odio porta lacus, ut elementum justo nulla"
                + " et dolor.";
        String text2 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum sa gittis.";

        int width = 30;
        System.out.println(justify(text1, width));
    }

    private static String justify(String text, int width) {

        String[] t_Arr = text.split(" ");
        int qtyWords = t_Arr.length;

        StringBuilder jText = new StringBuilder();
        int RowLength = 0;
        String tempWord = "";
        StringBuilder tempRow = new StringBuilder();

        for (int i = 0; i < qtyWords; i++) {
            tempWord = t_Arr[i];

            if (tempWord.length() <= width - RowLength) {
                tempRow.append(tempWord).append(" ");
                RowLength = tempRow.length();
                if (i == qtyWords - 1) {
                    tempRow.deleteCharAt(tempRow.length() - 1);
                    jText.append(tempRow);
                }
            } else {
                tempRow.deleteCharAt(tempRow.length() - 1); // delete last SPACE

                inputSpaces(tempRow, width);

                jText.append(tempRow);
                jText.append("\n");
                RowLength = 0;
                tempRow.setLength(0);
                i--;
            }
        }
        return String.valueOf(jText);
    }

    public static void inputSpaces(StringBuilder tempRow, int width) {

        String SPACE = " ";
        int qtySpaces = 0;
        String str = String.valueOf(tempRow);
        for (char c : str.toCharArray()) {
            if (c == ' ') qtySpaces++;
        }

        if (qtySpaces == 0) {
            return;
        } else {
            int qtyNeeded = width - str.length() + qtySpaces;

            //System.out.println("qtyNeeded = " + qtyNeeded);

            int k_forAll = qtyNeeded / qtySpaces;
            int k_forFirsts = qtyNeeded % qtySpaces;
            // Array of spaces:
            StringBuilder[] spaces = new StringBuilder[qtySpaces];
            // Add SPACES for all places
            for (int i = 0; i < qtySpaces; i++) {
                spaces[i] = new StringBuilder("");
                spaces[i].append(SPACE.repeat(k_forAll));
            }
            // Add SPACE only for first places
            for (int i = 0; i < k_forFirsts; i++) {
                spaces[i].append(SPACE);
            }
            // Change all spaces to RIGHT values:
            int indexSP = tempRow.indexOf(" ");
            for (int i = 0; i < qtySpaces; i++) {
                tempRow.replace(indexSP, indexSP + 1, String.valueOf(spaces[i]));
                indexSP += String.valueOf(spaces[i]).length();
                indexSP = tempRow.indexOf(" ", indexSP);
            }
        }
    }
}
