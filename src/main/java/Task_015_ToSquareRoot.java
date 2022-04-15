import java.util.Arrays;
public class Task_015_ToSquareRoot {
    public static void main(String[] args) {

        int[] inputArr = new int[] {4, 3, 9, 7, 2, 1};

        int[] expectedArr = squareOrSquareRoot(inputArr);
        System.out.println(Arrays.toString(expectedArr));
    }

    private static int[] squareOrSquareRoot(int[] anyArr) {

        int[] newArr = new int[anyArr.length];

        for (int i = 0; i < anyArr.length; i++) {
            if ((Math.sqrt(anyArr[i])) % 1 == 0) {
                newArr [i] = (int) Math.sqrt(anyArr[i]);
            } else {
                newArr [i] = anyArr[i] * anyArr[i];
            }
        }
        return newArr;

    }

}
