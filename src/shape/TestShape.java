package shape;

public class TestShape {
    public static void main(String[] args) {
        Shape shape = new Shape("red", true);
        System.out.println(shape);

        Circle circle = new Circle("blue", false, 5.0);
        System.out.println(circle);

        Rectangle rectangle = new Rectangle("yellow", true, 10.0, 20.0);
        System.out.println(rectangle);

        Square square = new Square("purple", false, 20.0);
        System.out.println(square);
    }
}
