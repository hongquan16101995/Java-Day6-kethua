package shape;

public class Shape {

    private String color;
    private boolean filled;

    public Shape(){
        this.color = "green";
        this.filled = true;
    }

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color " + this.color + " and " + (filled==true ? "filled":"no filled");
    }
}

class Circle extends Shape {

    private double radius;

    public Circle(){
        this.radius = 1.0;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPerimeter(){
        return this.radius*2*Math.PI;
    }

    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius is " + this.radius + ", which is a subclass of " + super.toString();
    }
}

class Rectangle extends Shape{

    private double width;
    private double height;

    public Rectangle(){

    }

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return this.height*this.width;
    }

    public double getPerimeter(){
        return (this.height+this.height)*2;
    }

    @Override
    public String toString() {
        return "A Rectangle with width is " + this.width + " and length is " + this.height
                + ", which is a subclass of " + super.toString();
    }
}

class Square extends Rectangle{

    private double size;

    public Square(){
        this.size = 1.0;
    }

    public Square(double size){
        super(size,size);
    }

    public Square(String color, boolean filled,  double size) {
        super(color, filled, size, size);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        setWidth(size);
        setHeight(size);
    }

    @Override
    public void setWidth(double width) {
        setSize(width);
    }

    @Override
    public void setHeight(double height) {
        setSize(height);
    }

    @Override
    public String toString() {
        return "A Square with side is " + this.size + " , which is a subclass of " + super.toString();
    }
}
