package Task_OOP_04;

import java.util.Arrays;

public class Reader {
    private String name;
    private int ticketNumber;
    private int faculty;
    private int birthDate;
    private String mobile;

    public Reader(String name, int ticketNumber, int faculty, int birthDate, String mobile) {
        this.name = name;
        this.ticketNumber = ticketNumber;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.mobile = mobile;
    }

    public void takeBook(int qtyTakeBooks) {
        System.out.printf("%s took %s books.\n", name, qtyTakeBooks);
    }

    public void takeBook(Book... books) {
        System.out.printf("%s took %s books: ", name, books.length);
        System.out.println(Arrays.toString(books));
    }

    public void returnBook(Book... books) {
        System.out.printf("%s returned %s books: ", name, books.length);
        System.out.println(Arrays.toString(books));
    }
}