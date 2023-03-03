package day1b;

import java.util.Scanner;

public class b83 {
    public static void main(String[] args) {
        float a, b;
        System.out.print("Nhap a,b: ");
        Scanner in = new Scanner(System.in);
        a = in.nextFloat();
        b = in.nextFloat();
       if(a >= 0 && b >= 0 || (a < 0 && b < 0)){
           System.out.printf("%.0f va %.0f cung dau", a, b);
       }else{
           System.out.printf("%.0f va %.0f trai dau", a, b);
       }

    }
}
