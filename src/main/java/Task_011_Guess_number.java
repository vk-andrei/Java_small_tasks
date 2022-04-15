import java.util.Scanner;
// Угадай число от 0 до 10, 20, 30
public class Task_011_Guess_number {

    private static final Scanner SCAN = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("---GUESS THE NUMBER---");
        for (int range = 10; range <= 30; range += 10) guessNum(range);
        SCAN.close();
        System.out.println("---YOU WIN---");
    }

    private static void guessNum (int range) {

        int answerNum = (int) (Math.random() * (range + 1));

        while (true) {
            System.out.println("Input any number from 0 to " + range + ":");
            int userNum = SCAN.nextInt();
            if (userNum == answerNum) {
                System.out.println("YES!!!");
                break;
            } else if (userNum > answerNum) {
                System.out.println("My number is less");
            } else {
                System.out.println("My number is bigger");
            }
        }
    }

}
