import java.util.Arrays;
import java.util.Scanner;
// С клавиатуры вводится число n - размер массива. Необходимо создать массив указанного размера и заполнить его случайными
// числами от 0 до 10 (включительно). Используя цикл for each вывести содержимое массива в консоль, а также вывести в
// консоль информацию о: а) Длине массива  б) Количестве чисел больше 8 в) Количестве чисел равных 1
// г) Количестве четных чисел    д) Количестве нечетных чисел  е) Сумме всех элементов массива
public class Task_007 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input array's size: ");
        int n = input.nextInt();
        int[] myArr = new int[n];
        int n8 = 0, n1 = 0, even = 0, odd = 0, sum = 0;
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = (int) (Math.random() * 11);
            sum += myArr[i];
            if (myArr[i] > 8) {
                n8++;
            }
            if (myArr[i] == 1) {
                n1++;
            }
            if (myArr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }

        }
        System.out.println(Arrays.toString(myArr));
        System.out.println("Array's length: " + myArr.length);
        System.out.println("Numbers > 8: " + n8);
        System.out.println("Numbers = 1: " + n1);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
        System.out.println("Summ of all numbers: " + sum);


    }
}