package day1b;

import java.util.Scanner;

public class b97 {
    public static void main(String[] args) {
        float a,b,c;
        System.out.print("Nhap 3 so a,b,c: ");
        Scanner in = new Scanner(System.in);
        a = in.nextFloat();
        b = in.nextFloat();
        c = in.nextFloat();

        if( a < 0 || b< 0 || c< 0
                || (a+b < c) || (a+c < b)|| (b+c < a) ){
            System.out.print("Nhap sai.");
        }else{
            if(a * a + b * b == c * c || a * c + c * c == b * b || b * b + c * c == a * c){
                System.out.print("Tam Giac Vuong.");
            }else if((a == b) && (b == c)) {
                System.out.print("Tam Giac Deu.");
            }else if(a == b || a == c || b == c){
                System.out.print("Tam Giac Can.");
            }else{
                System.out.print("Tam Giac Thuong.");
            }
        }
    }
}
