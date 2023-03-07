package day4.kethua;

public class Hinh {
    private double chieuDai =1;
    private double chieuRong =1;
    public Hinh(){}


    public Hinh(double chieuDai, double chieuRong) {
        if(chieuDai >0 && chieuRong>0){
            this.chieuDai = chieuDai;
            this.chieuRong = chieuRong;
        }else{
            throw new RuntimeException("Nhap Canh sai");
        }
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        if(chieuDai>0){
            this.chieuDai = chieuDai;
        }else{
            throw new RuntimeException("Nhap Canh sai");
        }
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        if(chieuRong>0){
            this.chieuRong = chieuRong;
        }else{
            throw new RuntimeException("Nhap Canh sai");
        }
    }
    public double tinhChuVi(){
        return (chieuDai+chieuRong)*2;
    }
    public double tinhDienTich(){
        return chieuRong*chieuDai;
    }

    @Override
    public String toString() {
        return "Hinh{" +
                "chieuDai=" + chieuDai +
                ", chieuRong=" + chieuRong +
                ", chu vi=" + tinhChuVi() +
                ", dien tich=" + tinhDienTich() +
                '}';
    }
}
