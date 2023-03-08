package day5.Bt1;

public abstract class HinhHoc {
    private String color = "Black";

    public HinhHoc(){

    }
    public HinhHoc(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double tinhChuVi();
    public abstract double tinhDienTich();

    @Override
    public String toString() {
        return "HinhHoc[" +
                "color='" + color + '\'' +
                ']';
    }
}
