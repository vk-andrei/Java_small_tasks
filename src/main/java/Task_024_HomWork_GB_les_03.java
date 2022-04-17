import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.min;

// ������� ������ �� ����
//        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
//       "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
//        "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"}.
// ��� ������� ��������� ��������� ���������� �����, ����������� ����� � ������������, ���������� ��� � ����������
// ������ � ��������, ��������� �� ������� ������������. ���� ����� �� �������, ��������� ���������� �����, �������
// ����� �� ����� ������.
// apple � ����������
// apricot - ����� ������
// ap############# (15 ��������, ����� ������������ �� ��� ������ ����� �����)
// ��� ��������� ���� ���� ����������� ����� ������������:
// String str = "apple";
// char a = str.charAt(0); - �����, ������ char, ������� ����� � ����� str �� ������ �������
// ������ �� ��� ���, ���� ����� �� �������� �����. ���������� ������ ��������� �����.
public class Task_024_HomWork_GB_les_03 {
    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        Random rand = new Random();
        final String ANSWER = words[rand.nextInt(25)]; // Comp guessing the word

        System.out.println(Arrays.toString(words));

        System.out.println("-----------------------------");
        System.out.println("Try to guess what I guessed: ");

        guessTheWord(ANSWER);
    }
       private static void guessTheWord(String ans) {

        String userAnswer;
        String temp = "";
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("your input: ");
            userAnswer = input.next();
            for (int i = 0; i < min(userAnswer.length(), ans.length()); i++) {
                if (userAnswer.charAt(i) == ans.charAt(i)) {
                    temp += userAnswer.charAt(i);
                } else {
                    temp += "*";
                }
            }
            int l = 15 - ans.length(); // how many asterisks to add?
            temp += "*".repeat(l);
            System.out.println(temp);
            temp = "";
        }
        while (!userAnswer.equals(ans));
        input.close();
        System.out.println("You win! Congratulations!");
    }
}




