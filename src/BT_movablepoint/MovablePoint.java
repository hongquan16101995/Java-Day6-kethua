package BT_movablepoint;

import BT_point2Dandpoint3D.Point2D;

class MovablePoint extends Point2D {

    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(){

    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        float[] array = new float[2];
        array[0] = xSpeed;
        array[1] = ySpeed;
        return array;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] move(){
        float x = super.getX();
        super.setX(x += this.xSpeed);
        float y = super.getY();
        super.setY(y += this.ySpeed);
        float[] arr = new float[2];
        arr[0] = super.getX();
        arr[1] = super.getY();
        return arr;
    }

    public String toString(){
        return "x = " + super.getX() + " , " + "y = " + super.getY() + " ; speed = " + this.xSpeed + " , " + this.ySpeed;
    }
}
