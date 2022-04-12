// Заполнить двумерный массив (матрицу) случайными числами от 0 до 50. Размер матрицы задать m=12, n=8
// (m - размерность по строкам, n - размерность по колонкам). В консоль вывести индекс строки, сумма чисел в которой
// максимальна. Если таких строк несколько, вывести индекс последней из них.

import java.util.Arrays;
public class Task_0009 {
    public static void main(String[] args) {

        int[][] myArr = new int[12][8];

        for (int i = 0; i < myArr.length; i++) {
            for (int j = 0; j < myArr[0].length; j++) {
                myArr[i][j] = (int) (Math.random() * 51);
            }
        }
        for (int[] elems : myArr) {
            System.out.println(Arrays.toString(elems));
        }


        int sum = 0;
        int maxSum = 0;
        int indexMax = 0;
            for (int i = 0; i < myArr.length; i++) {
                for (int j = 0; j < myArr[0].length; j++) {
                    sum += myArr[i][j];
                }
                if (sum > maxSum) {
                    maxSum = sum;
                    indexMax = i;
                }
                sum = 0;
            }
        System.out.println("maxSum = " + maxSum);
        System.out.println("indexMax = " + indexMax);
    }
}
