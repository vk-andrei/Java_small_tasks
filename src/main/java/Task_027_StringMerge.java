// Given two words and a letter, return a single word that's a combination of both words, merged at the point where
// the given letter first appears in each word. The returned word should have the beginning of the first word and the
// ending of the second, with the dividing letter in the middle. You can assume both words will contain the dividing letter.
public class Task_027_StringMerge {
    public static void main(String[] args) {

        String str1 = new String("wonderful");
        String str2 = new String("people");
        char letter = 'e';
        System.out.println(stringMerge(str1, str2, letter));     //wonde ople
    }

    private static String stringMerge(String str1, String str2, char l) {

        //   MY SOLUTION
   /*     char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();

        StringBuilder str = new StringBuilder();

        for (char elem : s1) {
            str.append(elem);
            if (elem == l) {
                break;
            }
        }
        int index1 = str2.indexOf(l);

        for (int i = index1 + 1; i < s2.length; i++) {
            str.append(s2[i]);
        }

        return str.toString();*/

        // IN ONE STRING !!!!!!!!!!!!!!!!!!!!!!!!!!!!!

        return str1.substring(0,str1.indexOf(l)) + str2.substring(str2.indexOf(l));
    }
}