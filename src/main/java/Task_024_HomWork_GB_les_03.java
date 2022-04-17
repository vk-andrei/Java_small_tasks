import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.min;

// Создать массив из слов
//        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
//       "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
//        "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"}.
// При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя, сравнивает его с загаданным
// словом и сообщает, правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы, которые
// стоят на своих местах.
// apple – загаданное
// apricot - ответ игрока
// ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
// Для сравнения двух слов посимвольно можно пользоваться:
// String str = "apple";
// char a = str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
// Играем до тех пор, пока игрок не отгадает слово. Используем только маленькие буквы.
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




