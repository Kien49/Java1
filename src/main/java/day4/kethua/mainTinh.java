package day4.kethua;

public class mainTinh {
    public static void main(String[] args) {
        HinhVuong hv = new HinhVuong();
        hv.setCanh(5);
        System.out.println(hv);
/*        System.out.printf("Chu Vi hv: %.1f", hv.tinhChuVi());
        System.out.printf("\nDien Tich hv: %.1f", hv.tinhDienTich());*/

        Hinh hcn = new Hinh();
        hcn.setChieuDai(4);
        hcn.setChieuRong(3);
        System.out.println(hcn);
    }
}
