import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.
// It should remove all values from list a, which are present in list b keeping their order.//
// Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}
// If a value is present in b, all of its occurrences must be removed from the other://
//Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3}
public class Task_025_Diff_Arrays {
    public static void main(String[] args) {

        final int[] a = new int[] {1, 2, 2, 2, 3};
        final int[] b = new int[] {2, 5};
        int[] result = arrayDiff(a, b);                      //    {1, 3}
        System.out.print("AFTER a - b: ");
        System.out.println(Arrays.toString(result));
    }

    private static int[] arrayDiff(int[] a, int[] b ) {         // a - b

        List<Integer> int_List_a = new ArrayList<>();
            for (int elem : a) {
                int_List_a.add(elem);
            }
        System.out.println("WAS a: " + Arrays.toString(int_List_a.toArray()));

        List<Integer> int_List_b = new ArrayList<>();
            for (int elem: b) {
                int_List_b.add(elem);
            }
        System.out.println("WAS b: " + Arrays.toString(int_List_b.toArray()));

        int_List_a.removeAll(int_List_b);

        int [] c = new int[int_List_a.size()];
        int i = 0;
        for (int elem: int_List_a) {
            c[i++] = elem;
        }

        return c;
    }
}