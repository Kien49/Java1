package day5.Bt1;

public class HinhVuong extends  HinhHoc{
    private double canh = 1.0;

    private HinhVuong(){

    }
    public HinhVuong(double canh) {
        this.canh = canh;
    }

    public HinhVuong(String color, double canh) {
        super(color);
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }

    @Override
    public double tinhChuVi() {
        return canh*4;
    }

    @Override
    public double tinhDienTich() {
        return canh*canh;
    }

    @Override
    public String toString() {
        return "HinhVuong{" + super.toString() +
                ", canh=" + canh +
                '}';
    }
}
