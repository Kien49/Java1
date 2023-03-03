package day1b;

import java.util.Scanner;

public class bt1 {
    public static void main(String[] args) {
        int n;
        System.out.print("Nhap n: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        in.close();
        if(n%2 == 0){
            System.out.printf("%d la so chan.", n);
        }if(n%2 != 0){
            System.out.printf("%d la so le",n);
        }
    }
}
