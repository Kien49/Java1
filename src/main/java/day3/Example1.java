package day3;

import java.util.Scanner;

public class Example1 {
    public static float sum2So(float a, float b){
        float sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        float a, b;
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap 2 so a,b: ");
        a = in.nextFloat();
        b = in.nextFloat();
        in.close();

        float sum = sum2So(a,b);
        System.out.printf("Tong la: %.1f",sum);
    }
}
