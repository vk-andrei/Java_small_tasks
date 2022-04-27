package classQueue;

public class Main {
    public static void main(String[] args) {

        Queue bigQueue = new Queue(50);
        char ch;

        for (int i = 0; i < 26; i++) {
            bigQueue.putSymb((char) ('A' + i));

        }
        System.out.println("INSIDE QUEUE:");
        for (int i = 0; i < 26; i++) {
            ch = bigQueue.getSymb();
            if (ch != (char) 0) {
                System.out.print(ch + " ");
            }
        }

    }
}
