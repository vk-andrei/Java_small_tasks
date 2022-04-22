import java.util.Random;
import java.util.Scanner;

public class temp_2 {
    public static void main(String[] args) {

        Random r = new Random();
        Scanner scan = new Scanner(System.in);
//        for (int i = 0; i < 30; i++) {
//            int x = r.nextInt(0,3);
//            System.out.println(x);

        System.out.println("Input two numbers throw the space: ");
        String str = scan.nextLine();
        String[] numbers = str.split(" ");
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);
        System.out.println(a + "" + b);




        }
    }

