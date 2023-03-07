package day3;

import java.util.Random;
import java.util.Scanner;

public class b145 {
    private static boolean isPerfectNumber(int n)
    {
        int sum = 0;
        for (int i = 1 ; i < n; i++){
            if( n % i == 0){
                sum += i;
            }
        }
        if (sum == n){
            return true;
        }
        return false;
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

            int numberPerfect = -1;

            for(int i =0; i<n ;i++){
                if(isPerfectNumber(arr[i])){
                    numberPerfect = arr[i];
                    break;
                }
            }

            System.out.printf("\nSo hoan thien dau tien: %d", numberPerfect);

        }
    }
}
