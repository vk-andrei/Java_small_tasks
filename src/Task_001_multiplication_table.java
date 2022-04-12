public class Task_001_multiplication_table {
    public static void main(String[] args) {

        int k = (int) (Math.random() * 9) + 1;

        for (int i = 1; i < 10; i++) {
            System.out.println(i + " x " + k + " = " + (i * k));
        }


    }
}
