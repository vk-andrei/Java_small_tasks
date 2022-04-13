public class Task_016_MultiplesOf3and5 {
    public static void main(String[] args) {

        int n = 1000;
        System.out.println(solution(n));
    }

    public static int solution(int number) {
        int sum = 0;
        if (number < 0) return sum;
        for (int i = 3; i < number; i++) {
            if ((i % 3 == 0) || (i % 5 == 0)) {
                sum += i;
            }
        }
        return sum;
    }

}