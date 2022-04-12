// You are given two arrays a1 and a2 of strings. Each string is composed with letters from a to z. Let x be any string
// in the first array and y be any string in the second array.
// Find max(abs(length(x) − length(y)))    If a1 and/or a2 are empty return -1
public class Task_013_Max_Length_Diff {

    public static String[] max_min_StringInArray (String[] anyString) {
        String max_anyString = anyString[0];
        String min_anyString = anyString[0];
        for (int i = 1; i < anyString.length; i++) {
            if (anyString[i].length() > max_anyString.length()) {
                max_anyString = anyString[i];
                }
        }
        for (int i = 1; i < anyString.length; i++) {
            if (anyString[i].length() < min_anyString.length()) {
                min_anyString = anyString[i];
            }
        }
        // System.out.println("Max string is: " + max_anyString);
        // System.out.println("Min string is: " + min_anyString);
        String[] arr = new String[] {max_anyString, min_anyString};
        return arr;
    }

    public static void main(String[] args) {

        String[] s1 = new String[]{"12345678", "1234", "12", "123456789"};
        String[] s2 = new String[]{"456", "1111", "1"};

        String[] s1_maxMin = max_min_StringInArray(s1);
        String[] s2_maxMin = max_min_StringInArray(s2);

        int diff1 = Math.abs(s1_maxMin[0].length() - s2_maxMin[1].length());
        int diff2 = Math.abs(s2_maxMin[0].length() - s1_maxMin[1].length());

        // System.out.println("diff1 = " + diff1);
        // System.out.println("diff2 = " + diff2);

        System.out.println("MAX LENGTH: " + (diff1 > diff2 ? diff1 : diff2));
        // System.out.println("MAX LENGTH: " + (Math.max(diff1, diff2)));
    }

}

