package day4.donggoi1;

public class HinhChuNhat {
    private double chieuDai =1.0f;
    private double chieuRong =1.0f;
    public HinhChuNhat(){

    }
    public HinhChuNhat(double cd, double cr){
        this.chieuDai = cd;
        this.chieuRong = cr;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        if(chieuDai > 0){
            this.chieuDai = chieuDai;
        }else{
            System.out.println("Nhap lai chieu dai");
        }
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        if(chieuDai > 0){
            this.chieuRong = chieuRong;
        }else{
            System.out.println("Nhap lai chieu rong");
        }
    }

    public double chuVi(){
        return (chieuDai+chieuRong)*2;
    }
    public  double dienTich(){
        return chieuDai*chieuRong;
    }
}
