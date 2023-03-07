package day3;

import java.util.Scanner;

public class DienTichMax {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap so hcn: ");
        n = in.nextInt();

/*        Hcn hcn = new Hcn();

        double sMax = 0;
        int hinhMax =1 ;
        for(int i =1; i<= n; i++){
            System.out.printf("Cd, CR cua hcn %d: ",i);
            hcn.chieuDai = in.nextInt();
            hcn.chieuRong = in.nextInt();

            if(sMax < hcn.tinhDientich()){
                hinhMax =i;
                sMax = hcn.tinhDientich();
            }
        }*/ // constructor rong


        Hcn[] arr = new Hcn[n]; // khai bao mang
        for(int i =0; i< n; i++){ // nhap du lieu
            System.out.printf("Cd, CR cua hcn %d: ",i+1);
            double chieuDai = in.nextDouble();
            double chieuRong = in.nextDouble();

            arr[i] = new Hcn(chieuDai, chieuRong);
        }
        in.close();
        //in ra mang
        for(int i =0; i< n; i++){
            System.out.printf(arr[i].toString());
        }
        double sMax = arr[0].tinhDientich();
        int hinhMax =0;
        for(int i =1; i< arr.length; i++) {
            if (sMax < arr[i].tinhDientich()) {
                hinhMax = i+1;
                sMax = arr[i].tinhDientich();
            }
        }
        System.out.printf("\nSmax: %.1f, hinh so: %d", sMax, hinhMax);

    }
}
