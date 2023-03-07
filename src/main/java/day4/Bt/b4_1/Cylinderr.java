package day4.Bt.b4_1;

public class Cylinderr {
    private double height = 1;
    private final Circle circle;

    public Cylinderr(){
        circle = new Circle();
    }
    public Cylinderr(double height, Circle circle){
        if(height <= 0){
            throw new RuntimeException("Error");
        }
        this.height = height;
        this.circle = circle;
    }
    public Cylinderr(double height, double radius){
        if(height <= 0){
            throw new RuntimeException("Error");
        }
        this.height = height;
        this.circle = new Circle(radius);
    }
    public Cylinderr(double height, double radius, String color){
        if(height <= 0){
            throw new RuntimeException("Error");
        }
        this.height = height;
        this.circle = new Circle(radius, color);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height <= 0){
            throw new RuntimeException("Error");
        }
        this.height = height;
    }

    public Circle getCircle() {
        return circle;
    }

    public double getVolume(){
        return circle.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", circle=" + circle +
                '}';
    }

    public double getAroundArea(){
        return circle.getPerimeter() * height;
    }

    public double getTotalArea(){
        return getAroundArea() + 2 * circle.getArea();
    }

}
