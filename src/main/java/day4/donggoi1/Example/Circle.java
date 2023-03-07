package day4.donggoi1.Example;

public class Circle {
    private double radius =1f;

    public Circle(){

    }
    public Circle(double r){
        if(r > 0){
            this.radius = r;
        }
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius > 0){
            this.radius = radius;
        }
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }
    public double getCircumference(){
        return 2 * radius * Math.PI;
    }
    @Override
    public String toString() {
        return "Circle[" +
                "radius=" + radius +
                ']';
    }
}
