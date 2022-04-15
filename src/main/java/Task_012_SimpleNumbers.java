public class Task_012_SimpleNumbers {
    public static void main(String[] args) {

        int numberOfDividers;
        System.out.println("Simple numbers: ");

        for (int i = 2; i < 100; i++) {
            numberOfDividers = 0;
            for (int divider = 2; divider < i; divider++) {
                if (i % divider == 0) {
                    numberOfDividers++;
                }
            }
            if (numberOfDividers == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

