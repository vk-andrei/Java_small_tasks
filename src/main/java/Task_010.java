import java.util.Arrays;
// Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
// Найти максимум среди сумм трех соседних элементов. Для найденной тройки с максимальной суммой выведите
// значение суммы и индекс первого элемента тройки.
public class Task_010 {
    public static void main(String[] args) {

        int[] myArr = new int[100];
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = (int) (Math.random() * 10001);
        }
        System.out.println(Arrays.toString(myArr));

        int sum = 0;
        int max3 = 0;
        int index = 0, maxIndex = 0;

        for (int i = 0; i < myArr.length - 2; i++) {

            for (int j = i; j < 3 + i; j++) {
                sum += myArr[j];
                index = i;
            }

            if (sum > max3) {
                max3 = sum;
                maxIndex = index;
            }
            // System.out.print(sum + "  ");
            sum = 0;

        }
        System.out.println("\nMax3 = " + max3);
        System.out.println("Max index = " + maxIndex);

    }
}
