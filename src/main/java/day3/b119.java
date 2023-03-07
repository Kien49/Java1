package day3;

import java.util.Scanner;

public class b119 {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap n: ");
        n = in.nextInt();

        for(int i =1; i< n; i++){
            if(isPrime(i)){
                System.out.printf("%d ",i);
            }
        }
    }
}
