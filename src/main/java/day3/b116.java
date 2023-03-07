package day3;

import java.util.Scanner;

public class b116 {
    public static int tongDay(int n){
        int sum = 0;
        for(int i =1; i <= n; i++){
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap n: ");
        n = in.nextInt();

        System.out.printf("Tong la: %d", tongDay(n));
    }
}
