package day3;

import java.util.Random;
import java.util.Scanner;

public class BT3_hinhtron {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap so ht: ");
        n = in.nextInt();

        HinhTron[] arr = new HinhTron[n];// Tao mang

        Random rd = new Random();

        for(int i =0; i< arr.length; i++){
            int k = rd.nextInt(20)+1;
            arr[i] = new HinhTron(k);
        }
        for (HinhTron ht: arr) {
            System.out.printf(ht.toString()+ "\n");
        }
        in.close();


        double chuviMax = arr[0].tinhChuVi();
        int hinhChuviMax =1;

        double dienTichMin = arr[0].tinhDienTich();
        int hinhDienTichMin =1;

        double sumChuVi =0, tbSumChuVi =0;
        int count =0;
        for(int i =0; i< arr.length; i++) {
            if (chuviMax < arr[i].tinhChuVi()) {
                hinhChuviMax = i+1;
                chuviMax = arr[i].tinhChuVi();
            }
            if (dienTichMin > arr[i].tinhDienTich()) {
                hinhDienTichMin = i+1;
                dienTichMin = arr[i].tinhDienTich();
            }

            sumChuVi += arr[i].tinhChuVi();
        }
        tbSumChuVi = sumChuVi / arr.length;
        for(int i =0; i< arr.length; i++) {
            if(arr[i].tinhChuVi() > tbSumChuVi){
                count ++;
            }
        }
        System.out.printf("\nChu vi Max: %.1f, hinh so: %d",chuviMax, hinhChuviMax);
        System.out.printf("\nDien tich Min: %.1f, hinh so: %d",dienTichMin, hinhDienTichMin);
        System.out.printf("\nTrung binh Chu vi: %.1f",tbSumChuVi);
        System.out.printf("\nSo hinh lon hon tb chu vi la: %d",count);

        double temp = arr[0].banKinh;
        for(int i =0; i< arr.length; i++){
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].banKinh > arr[j].banKinh) {
                    temp = arr[j].banKinh;
                    arr[j].banKinh = arr[i].banKinh;
                    arr[i].banKinh = temp;
                }
            }
        }
        System.out.print("\nSx hinh tron bk tang dan: \n");
        for(int i =0; i< n; i++){
            System.out.printf(arr[i].toString()+ "\n");
        }

    }
}
