package day3;

public class HinhTron {
    double banKinh;

    //Contrusctor - phuong thuc khoi tao
    public HinhTron(double banKinh){
        this.banKinh = banKinh;
    }

    public double tinhChuVi(){
        return 2*banKinh*(3.14);
    }
    public double tinhDienTich(){
        return  3.14*banKinh*banKinh;
    }

    @Override
    public String toString() {
        return "HinhTron{" +
                "banKinh=" + banKinh +
                '}';
    }
}
