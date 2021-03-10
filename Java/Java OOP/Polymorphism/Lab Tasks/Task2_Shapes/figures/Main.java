package figures;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(4.0,5.0);
        Shape circle = new Circle(4.00);

        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());

        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());

    }
}
