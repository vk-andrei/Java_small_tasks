// Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
// если в массиве есть место, в котором сумма левой и правой части массива равны.
// Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true
public class Task_017_HomeWork_GB_les_02 {
    public static void main(String[] args) {

        int[] myArr = new int[] {3, 4, 4, 3, 100};   //{2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(checkBalance(myArr));
    }

    private static boolean checkBalance(int[] arr) {
        int sum1 = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            sum1 += arr [i];
            int sum2 = 0;
            for (int j = i + 1; j < arr.length; j++) {
                sum2 += arr[j];
            }
            System.out.print(sum1 + "   " + sum2);
            System.out.println();
            if (sum1 == sum2) return true;
            }
        return false;
    }
}

