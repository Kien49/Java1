package day2;

import java.util.Scanner;

public class b2 {
    public static void main(String[] args) {
        int n;
        System.out.print("Nhap n: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        in.close();

        long sum =0;

        if(n < 0){
            System.out.print("Nhap so duong. --Nhap Lai--");
        }else {
            for(int i=1; i<= n; i++){
                long temp = i*i;
                sum += temp;
            }
            System.out.printf("Tong la: %d", sum);

        }
    }
}
