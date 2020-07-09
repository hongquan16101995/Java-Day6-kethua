package BT_point2Dandpoint3D;

public class TestPoint {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(1.0f, 2.0f);
        System.out.println(point2D);

        float[] arr = point2D.getXY();
        for (int i=0; i<arr.length;i++){
            System.out.println(arr[i] + "\t");
        }

        System.out.println("arraynew2D");
        point2D.setXY(3.0f, 4.0f);
        float[] arr2 = point2D.getXY();
        for (int i=0; i<arr2.length;i++){
            System.out.println(arr2[i] + "\t");
        }

        Point3D point3D = new Point3D(5.0f, 6.0f, 7.0f);
        System.out.println(point3D);

        float[] arr3 = point3D.getXY(8.0f);
        for (int i=0; i<arr3.length;i++){
            System.out.println(arr3[i] + "\t");
        }

        System.out.println("arraynew3D");
        point3D.setXY(9.0f, 10.0f, 11.0f);
        float[] arr4 = point3D.getXY(11.0f);
        for (int i=0; i<arr4.length;i++){
            System.out.println(arr4[i] + "\t");
        }

    }
}
