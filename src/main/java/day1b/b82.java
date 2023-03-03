package day1b;

import java.util.Scanner;

public class b82 {
    public static void main(String[] args) {
        float a, b, c;
        System.out.print("Nhap a,b,c: ");
        Scanner in = new Scanner(System.in);
        a = in.nextFloat();
        b = in.nextFloat();
        c = in.nextFloat();
        float  max = a;
        if( b > max){
            max = b;
        }if(c > max){
            max = c;
        }
        System.out.printf("Max: %.0f",max);
    }
}
