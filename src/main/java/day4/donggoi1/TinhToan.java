package day4.donggoi1;

public class TinhToan {
    public static void main(String[] args) {
        HinhChuNhat hcn1 = new HinhChuNhat();
        hcn1.setChieuDai(0);
        hcn1.setChieuRong(4);
        System.out.printf("Cv: %.1f \t Dt: %.1f",hcn1.chuVi(), hcn1.dienTich());

        HinhChuNhat hcn2 = new HinhChuNhat(1.5,3);

        System.out.printf("\nCv: %.1f \t Dt: %.1f",hcn2.chuVi(), hcn2.dienTich());

    }
}
