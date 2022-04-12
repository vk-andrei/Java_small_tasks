import java.util.Scanner;
// Реализовать программу, которая 5 раз запрашивает от пользователя два числа - делимое и делитель. Для этих двух чисел
// программа рассчитывает результат деления и выводит его в консоль. Если пользователь вводит 0 в качестве делителя,
// вместо того, чтобы останавливать работу цикла принудительно, мы пропускаем итерацию и выводим в консоль сообщение “Деление на 0”.
// Ключевое слово else или два if использовать в этой программе нельзя. В решении обязательно использовать оператор continue.
public class Task_006 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 0;
        while (i < 5) {
            System.out.println("Input and divisible and divider: ");
            double d1 = input.nextDouble();
            double d2 = input.nextDouble();
            if (d2 == 0) {
                System.out.println("Division on zero");
                i++;
                continue;
            }
            System.out.println("d1 / d2 = " + (d1 / d2));
            i++;
        }
    }
}
