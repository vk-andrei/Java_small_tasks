import java.util.Arrays;
// Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
// Затем, используя цикл for each вывести в консоль:
// наибольший элемент массива      наименьший элемент массива   количество элементов массива, оканчивающихся на 0
// сумму элементов массива, оканчивающихся на 0
public class Task_008 {
    public static void main(String[] args) {
        int[] myArr = new int[100];
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = (int) (Math.random() * 10001);
        }
        System.out.println(Arrays.toString(myArr));

        int maxElem = myArr[0];
        int minElem = myArr[0];
        int end0 = 0;
        int sumEnd0 = 0;

        for (int elem : myArr) {
            if (elem > maxElem) {
                maxElem = elem;
            }
            if (elem < minElem) {
                minElem = elem;
            }
            if (elem % 10 == 0) {
                end0++;
                sumEnd0 +=elem;
            }
        }
        System.out.println("Max element: " + maxElem);
        System.out.println("Min element: " + minElem);
        System.out.println("Number of elements end with 0: " + end0);
        System.out.println("Sum of elements end with 0: " + sumEnd0);

    }
}


