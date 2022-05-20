package Task_OOP_04;

public class Start {
    public static void main(String[] args) {

        Reader[] readers = new Reader[3];
        readers[0] = new Reader("Andrei", 14, 3, 29011983, "9197956621");
        readers[1] = new Reader("Dima", 10, 1, 21011985, "9191116633");
        readers[2] = new Reader("Lena", 114, 2, 19011981, "9192226644");

        Book book1 = new Book("Alesha the dawn", "Putin");
        Book book2 = new Book("Garry Potter", "Bush");
        Book book3 = new Book("Russia Pa russia", "Putin hui");
        Book book4 = new Book("Naval n y i", "PutinDead ?");
        Book[] books = {book1, book2, book3, book4};

        readers[0].takeBook(3);
        readers[1].takeBook(book2, book4);

        readers[2].returnBook(book1, book3);

    }
}
