import java.util.Scanner;

// Реализовать программу, которая пока работает, принимает на вход от пользователя два числа - делимое и делитель.
// Для этих двух чисел программа рассчитывает результат деления и выводит его в консоль.
// Программа останавливает свою работу тогда, когда пользователь вводит 0 в качестве делителя.
public class Task_005 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Input and divisible and divider: ");
            double d1 = input.nextDouble();
            double d2 = input.nextDouble();
            if (d2 == 0) {
                break;
            }
            System.out.println("d1 / d2 = " + (d1 / d2));
        }
    }
}
