package day3;

import java.util.Scanner;

public class b117 {
    public static int tongDay(int n, int coso){
        int sum = 0;
        for(int i =1; i <= n; i++){
            sum += luyThua(coso,i);
        }
        return sum;
    }
    public static int luyThua(int coso, int somu){
        if(somu ==0) return 1;
        int lt = 1 ;
        for (int i = 0; i < somu; i++) {
            lt *= coso;
        }
        if( somu > 0){
            return lt;
        }
        return 1/lt;

    }
    public static void main(String[] args) {
        int n, x;
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap n, x: ");
        n = in.nextInt();
        x = in.nextInt();

        System.out.printf("Tong la: %d", tongDay(n,x));
    }
}
