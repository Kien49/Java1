package day2;

import java.util.Scanner;

public class b1 {
    public static void main(String[] args) {
        int n;
        System.out.print("Nhap n: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        in.close();

        if(n < 0){
            System.out.print("Nhap so duong. --Nhap Lai--");
        }else {
            double sum = (n+1) * n / 2;
            System.out.printf("Tong la: %.1f",sum);
        }
    }
}
