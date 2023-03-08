package day5.Bt1;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {

/*        HinhHoc[] arr = new HinhHoc[3];
        arr[0] = new HinhTron(3);
        arr[1] = new HinhTron(2);
        arr[2] = new HinhVuong(5);*/ // Nhap cung

        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap n: ");
        n = in.nextInt();

        HinhHoc[] arr = new HinhHoc[n];

        for(int i =0; i< n; i++){
            System.out.printf("Nhap Canh Hinh %d: ", i+1);
            double nhapCanh = in.nextFloat();
            arr[i] = new HinhVuong(nhapCanh);
            arr[i] = new HinhTron(nhapCanh);
            arr[i] = new LucGiacDeu(nhapCanh);
        }

        double minS = arr[0].tinhDienTich();
        HinhHoc minSHv = null;
        for(int i=0; i< n; i++){
            if(minS < arr[i].tinhDienTich()){
                minS = arr[i].tinhDienTich();
                minSHv = arr[i];
            }
        }
        System.out.println(minSHv);

    }
}
