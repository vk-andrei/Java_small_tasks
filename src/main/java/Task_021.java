// Leibniz formula for π
// 1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ... = π / 4

public class Task_021 {
    public static void main(String[] args) {

        Double epsilon = .1;
        System.out.println(iterationsPiQuantity_ToString(epsilon));
    }

    private static String iterationsPiQuantity_ToString(Double epsilon) {

        double sign = 1;
        double n = 1.0;
        double formula = 0;
        int count = 0;

        while (Math.abs(Math.PI - 4 * formula) > epsilon) {

            formula += sign * (1.0 / n);
            sign *= -1;
            n += 2.0;
            count += 1;
        }

        return String.format("[%d, %.10f]", count, (4 * formula));
    }
}