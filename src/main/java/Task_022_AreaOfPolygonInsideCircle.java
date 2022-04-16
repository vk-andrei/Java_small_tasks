// It should calculate the area of a regular polygon of numberOfSides inside a circle of radius circleRadius,
// which passes through all the vertices of the polygon (such circle is called circumscribed circle).
// The answer should be a number rounded to 3 decimal places.
public class Task_022_AreaOfPolygonInsideCircle {
    public static void main(String[] args) {

        double circleRadius = 3;
        int numberOfSides = 3;
        System.out.println(areaOfPolygonInsideCircle(circleRadius, numberOfSides));
    }

    private static double areaOfPolygonInsideCircle(double r, int s) {

        double polygonArea = 0.5 * s * Math.pow(r , 2) * Math.sin(2 * Math.PI / s);

        return Math.round(polygonArea * 1000.0) / 1000.0;
    }
}
