package day5.b6_1;

public class Square extends Rectangle{
    private double size=1.0;
    public Square(){

    }

    public Square(double size) {
        this.size = size;
    }


    public Square(String color, Boolean filled, double size) {
        super(color, filled);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        length = width=size;
    }

    @Override
    public void setWith(double side) {
        setSize(side);
    }

    @Override
    public void setLength(double side) {
        setSize(side);

    }

    @Override
    public String toString() {
        return "Square[" + super.toString()+
                ", width=" + width +
                ", length=" + length +
                '}';
    }
}
