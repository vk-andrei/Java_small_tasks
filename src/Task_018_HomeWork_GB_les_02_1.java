import java.util.Arrays;

public class Task_018_HomeWork_GB_les_02_1 {
    public static void main(String[] args) {
                                 //0   1   2   3
        int[] myArray = new int[] {10, 20, 30, 40};     //     40 10 20 30
        System.out.println(Arrays.toString(myArray));
        System.out.println("----PROCESS----");
        int n = -3;
        int[] changedArray = moveArray(myArray, n);;
        System.out.println("-----RESULT----");
        System.out.println(Arrays.toString(changedArray));
    }

    private static int[] moveArray(int[] anyArr, int n) {

        ///////////// POSITIVE n ///////////////////
        if (n >= 0) {
            for (int k = 0; k < n; k++) {

                int temp = anyArr[anyArr.length - 1];
                for (int i = 0; i < anyArr.length - 1; i++) {
                    anyArr [anyArr.length - 1 - i] = anyArr [anyArr.length - 1 - i - 1];
                }
                anyArr[0] = temp;
                System.out.println(Arrays.toString(anyArr));
            }
            return anyArr;
        }
        ///////////// NEGATIVE n ///////////////////
        for (int k = 0; k < Math.abs(n); k++) {

            int temp = anyArr[0];
            for (int i = 0; i < anyArr.length - 1; i++) {
                anyArr [i] = anyArr [i + 1];
            }
            anyArr[anyArr.length - 1] = temp;
            System.out.println(Arrays.toString(anyArr));
        }
        return anyArr;
    }
}

