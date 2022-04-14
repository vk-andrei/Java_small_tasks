public class Task_019 {
    public static void main(String[] args) {

        int[] peersArr = {20, 3};
        int yourPoint = 5;
        System.out.println(betterThanAverage(peersArr, yourPoint));
    }

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int sumClass = 0;
        for (int point : classPoints) {
            sumClass += point;
        }
        float average = (float) (sumClass + yourPoints) / (classPoints.length + 1);
    return (yourPoints > average);
    }
}