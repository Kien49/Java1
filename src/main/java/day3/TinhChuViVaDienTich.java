package day3;

public class TinhChuViVaDienTich {
    public static void main(String[] args) {
/*        Hcn hcn = new Hcn();
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap CD, CR");

        hcn.chieuDai = in.nextInt();
        hcn.chieuRong = in.nextInt();

        hcn.chuVi();
        hcn.dienTich();*/ // dung contructor rong

        Hcn hcn1 = new Hcn(5,6);
        hcn1.chuVi();
        hcn1.dienTich();
    }

}
