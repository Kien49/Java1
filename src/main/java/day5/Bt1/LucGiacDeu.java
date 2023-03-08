package day5.Bt1;

public class LucGiacDeu extends HinhHoc{
    private  double canh =1;

    public LucGiacDeu(){

    }
    public LucGiacDeu(double canh) {
        this.canh = canh;
    }

    public LucGiacDeu(String color, double canh) {
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
        return 0;
    }

    @Override
    public double tinhDienTich() {
        return (3*canh*canh*Math.sqrt(3)/2);
    }

    @Override
    public String toString() {
        return "LucGiacDeu{" + super.toString() +
                ", canh=" + canh +
                '}';
    }
}
