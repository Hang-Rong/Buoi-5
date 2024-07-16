public class Circle {
    private static final double PI = 3.14;
    private static int id = 0;
    private static Circle[] circles;
    private int circleId;
    private double radius;

    public Circle(double radius) {
        this.circleId = ++id;
        this.radius = radius;
        if (circles == null) {
            circles = new Circle[1];
        } else {
            Circle[] temp = new Circle[circles.length + 1];
            System.arraycopy(circles, 0, temp, 0, circles.length);
            circles = temp;
        }
        circles[circles.length - 1] = this;
    }

    public int getId() {
        return circleId;
    }

    public double getRadius() {
        return radius;
    }

    public static int count() {
        return id;
    }

    public double area() {
        return PI * Math.pow(radius, 2);
    }

    public double perimeter() {
        return 2 * PI * radius;
    }

    public static Circle maxRadius() {
        Circle maxCircle = circles[0];
        for (Circle circle : circles) {
            if (circle.radius > maxCircle.radius) {
                maxCircle = circle;
            }
        }
        return maxCircle;
    }

    public static double totalArea() {
        double total = 0;
        for (Circle circle : circles) {
            total += circle.area();
        }
        return total;
    }
}


