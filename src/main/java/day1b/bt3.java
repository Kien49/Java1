package day1b;

import java.util.Scanner;

public class bt3 {
    public static void main(String[] args) {
        float x;
        System.out.print("Nhap X: ");
        Scanner in = new Scanner(System.in);
        x = in.nextFloat();
        in.close();

        int y = (int)Math.sqrt(x);
        if(Math.sqrt(x) - y==0 && x > 0) {
            System.out.printf("%f la so chinh phuong.", x);
            System.exit(0);
        }
        System.out.printf("%.1f la kp",x);
    }
}
