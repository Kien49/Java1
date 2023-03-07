package day3;

public class Hcn {
    double chieuDai;
    double chieuRong;

    //Contrusctor - phuong thuc khoi tao
    public Hcn(){

    }
    public Hcn(double dai, double rong){
        this.chieuDai = dai;
        this.chieuRong = rong;
    }

    @Override
    public String toString() {
        return "Hcn{" +
                "chieuDai=" + chieuDai +
                ", chieuRong=" + chieuRong +
                '}';
    }

    public double tinhDientich(){
        return chieuDai * chieuRong;
    }

    public void chuVi(){
        System.out.printf("Chu vi hcn la: %.1f", ((chieuDai+chieuRong)*2));
    }

    public void dienTich(){
        System.out.printf("\nDien tich hcn la: %.1f", chieuDai*chieuRong);
    }
}
