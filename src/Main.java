public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(10);
        Circle circle3 = new Circle(7);

        System.out.println("Số hình tròn đã tạo: " + Circle.count());

        Circle maxRadiusCircle = Circle.maxRadius();
        System.out.println("Hình tròn có đường kính lớn nhất: Hình " + maxRadiusCircle.getId() + " với đường kính " + maxRadiusCircle.getRadius());

        System.out.println("Tổng diện tích của chúng là: " + Circle.totalArea());
    }
}
