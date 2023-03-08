package day5.Bt1;

public class HinhTron extends HinhHoc{
    private double banKinh = 1.0;

    public  HinhTron(){

    }
    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    public HinhTron(String color, double banKinh) {
        super(color);
        this.banKinh = banKinh;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public double tinhChuVi() {
        return 2*banKinh*Math.PI;
    }

    @Override
    public double tinhDienTich() {
        return banKinh*banKinh*Math.PI;
    }

    @Override
    public String toString() {
        return "HinhTron{" + super.toString()+
                ", banKinh=" + banKinh +
                '}';
    }
}
