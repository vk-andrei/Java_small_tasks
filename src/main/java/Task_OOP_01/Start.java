package Task_OOP_01;

import java.util.Arrays;

public class Start {
    public static void main(String[] args) {

        // Phone[][] phones = new Phone[3][];

        Phone phones1 = new Phone(917, "Nokia", 510);
        Phone phones2 = new Phone(918, "Samsung", 210);
        Phone phones3 = new Phone(919, "Apple", 110);
        System.out.println("-------");

        phones1.printInfo();
        phones2.printInfo();
        phones3.printInfo();
        System.out.println("-------");

        phones1.receiveCall("Andrei");
        phones2.receiveCall("Dima");
        phones3.receiveCall("Petr");
        System.out.println("-------");

        System.out.println(phones1.getNumber());
        System.out.println(phones2.getNumber());
        System.out.println(phones3.getNumber());
        System.out.println("-------");

        phones1.receiveCall("Mike", 987);
        System.out.println("-------");

        phones1.sendMessages(990, 923, 988, 917795);
    }
}
