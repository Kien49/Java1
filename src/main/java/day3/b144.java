package day3;

import java.util.Random;
import java.util.Scanner;

public class b144 {
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
        System.out.print("Nhap n: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        in.close();

        if(n < 1){
            System.out.print("Nhap lai");
        }else{
            int[] arr = new int[n];
            Random random = new Random();
            for (int i =0; i< n; i++){
                arr[i] = random.nextInt(200)-100;
                System.out.printf("%d ",arr[i]);
            }

            int primeNumber = -1;

            for(int i =0; i<n ;i++){
                if(isPrime(arr[i])){
                    primeNumber = arr[i];
                    break;
                }
            }

            System.out.printf("\nSo nguyen to dau tien: %d", primeNumber);
        }
    }
}
