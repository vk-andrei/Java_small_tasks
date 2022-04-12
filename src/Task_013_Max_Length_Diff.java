// You are given two arrays a1 and a2 of strings. Each string is composed with letters from a to z. Let x be any string
// in the first array and y be any string in the second array.
// Find max(abs(length(x) − length(y)))    If a1 and/or a2 are empty return -1
public class Task_013_Max_Length_Diff {
    public static void main(String[] args) {

        String[] s1 = new String[] {"12345678", "1234", "12", "123456789"};
        String[] s2 = new String[] {"456", "1111", "1"};
        // answer = 8 - 1 = 7


        String max_s1 = s1[0];
        int max_s1_index = 0;

        for (int i = 1; i < s1.length; i++) {
            if (s1[i].length() > s1[i - 1].length()) {
                max_s1 = s1[i];
                max_s1_index = i;
            }
        }

        System.out.println("Max string in s1: " + max_s1);
        System.out.println("Max index in s1: " + max_s1_index);

        String max_s2 = s2[0];
        int max_s2_index = 0;

        for (int i = 1; i < s2.length; i++) {
            if (s2[i].length() > s2[i - 1].length()) {
                max_s2 = s2[i];
                max_s2_index = i;
            }
        }

        System.out.println("Max string in s1: " + max_s2);
        System.out.println("Max index in s1: " + max_s2_index);




    }

}

