package BT_circleandcylinder;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0, "red");
        System.out.println(circle);
        Cylinder cylinder = new Cylinder(10.0, "blue", 10);
        System.out.println(cylinder);
        System.out.println("Volume of cylinder is " + cylinder.getVolume());
    }
}
