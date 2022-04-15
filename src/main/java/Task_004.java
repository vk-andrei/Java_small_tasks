import java.util.Scanner;

// Реализовать программу, используя switch, которая в консоль выводит название страны, принимая на вход название города.
// Программа должна работать до тех пор, пока не будет введено слово “Stop”.
// Реализовать, используя следующие данные: Москва, Владивосток, Ростов - Россия
// Рим, Милан, Турин - Италия    Ливерпуль, Манчестер, Лондон - Англия   Берлин, Мюнхен, Кёльн - Германия
// При вводе любого другого города, вывести сообщение “Неизвестная страна”.
public class Task_004 {
    public static void main(String[] args) {

        System.out.println("Input any city: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        switch (str) {
            case "Moscow", "Vladivostok", "Rostov" -> System.out.println("Russia");
            case "Rim", "Milan", "Turin" -> System.out.println("Italy");
            default -> System.out.println("Noname");
        }
    }
}
