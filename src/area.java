public class Main {

    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));

    }

    private static double area(double x, double y) {
        if (radius < 0) {
            return -1.0;
        }
        return Math.PI * radius * radius;
    }

    private static double area(double radius) {
        if (x < 0 || y < 0) {
            return -1.0;
        }
        return x * y;
    }
}

