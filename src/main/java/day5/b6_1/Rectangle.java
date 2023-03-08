package day5.b6_1;

public class Rectangle extends Shape{
    protected double width =1.0;
    protected double length =1.0;

    public Rectangle(){

    }
    public Rectangle(double with, double length) {
        this.width = with;
        this.length = length;
    }

    public Rectangle(String color, Boolean filled, double with, double length) {
        super(color, filled);
        this.width = with;
        this.length = length;
    }
    public Rectangle(String color, Boolean filled) {
        super(color, filled);
    }

    public double getWith() {
        return width;
    }

    public void setWith(double with) {
        this.width = with;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return (width+length)*2;
    }

    @Override
    public String toString() {
        return "Rectangle[" + super.toString()+
                ", width=" + width +
                ", length=" + length +
                ']';
    }
}
