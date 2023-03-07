package day4.kethua;

public class HinhVuong extends Hinh{
    private double canh =1;

    public HinhVuong(){

    }
    public HinhVuong(double canh) {
        super(canh, canh);
        this.canh= canh;

    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        if(canh <= 0){
            throw new RuntimeException("Cạnh phải là số dương");
        }
        this.canh = canh;
        super.setChieuDai(canh);
        super.setChieuRong(canh);
    }
    @Override
    public void setChieuDai(double canh) {
        super.setChieuDai(canh);
        super.setChieuRong(canh);
    }

    @Override
    public void setChieuRong(double canh) {
        super.setChieuRong(canh);
        super.setChieuDai(canh);
    }

    @Override
    public String toString() {
        return "HinhVuong{" +
                "canh=" + canh +
                ", chu vi=" + tinhChuVi() +
                ", dien tich=" + tinhDienTich() +
                '}';
    }



}
