package BT_movablepoint;

public class TestMove {
    public static void main(String[] args) {

        MovablePoint movablePoint = new MovablePoint(5.0f,5.0f,1.0f,1.0f);

        float[] arr1 = movablePoint.getSpeed();
        for(int i = 0; i<arr1.length; i++){
            System.out.println(arr1[i]);
        }

        System.out.println("arrSpeed");
        for (int j = 0; j<5; j++) {
            float[] arr2 = movablePoint.move();
            for (int i = 0; i < arr2.length; i++) {
                System.out.println(arr2[i]);
            }
        }

        System.out.println(movablePoint);
    }
}
