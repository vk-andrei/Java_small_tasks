// Есть два числа, которые задаются пользователем через консоль (назовем эти два числа a и b).
// Используя цикл for, вывести все числа из диапазона между a и b, которые делятся на 5 без остатка,
// но при этом не делятся на 10 без остатка. Сами числа a и b в диапазоне не учитывать.
// Если a >= b вывести сообщение "Некорректный ввод".
import java.util.Scanner;
public class Task_002 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input two numbers through a space: ");
        int a, b;
        while (true) {
            a = input.nextInt();
            b = input.nextInt();
            if (a >= b) {
                System.out.println("Wrong input");
            } else {
                break;
            }
        }
        /*
        int i;
        for (i = a; i < b; i++) {
            if ((i % 5 == 0) && (i % 10 != 0)) {
                System.out.print(i + " ");
            }*/
        int i = a;
        while (i < b) {
            if ((i % 5 == 0) && (i % 10 != 0)) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}


