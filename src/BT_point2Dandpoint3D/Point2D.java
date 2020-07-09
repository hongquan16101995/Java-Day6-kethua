package BT_point2Dandpoint3D;

public class Point2D {

    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D(){

    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }


    public float[] getXY(){
        float[] array = new float[2];
        array[0] = x;
        array[1] = y;
        return array;
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point2D {" + "x = " + x + ", y = " + y + "}";
    }
}

class Point3D extends Point2D{

    private float z;

    public Point3D(){

    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXY(float z){
        float[] array = new float[3];
        array[0] = super.getX();
        array[1] = super.getY();
        array[2] = z;
        return array;
    }

    public void setXY(float x, float y, float z){
        super.setXY(x,y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D {" + "x = " + super.getX() + ", y = " + super.getY() + ", z = " + this.z + "}";
    }
}
