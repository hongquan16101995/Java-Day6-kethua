package BTT_triangle;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào cạnh 1: ");
        double a = sc.nextDouble();
        System.out.println("Nhập vào cạnh 2: ");
        double b = sc.nextDouble();
        System.out.println("Nhập vào cạnh 3: ");
        double c = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhập vào màu của triangle: ");
        String color = sc.nextLine();

        Triangle triangle = new Triangle(color, true, a, b, c);
        System.out.println(triangle.toString1());
        System.out.println(triangle);
        System.out.println(triangle.toString2());
    }
}
