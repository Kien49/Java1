package day3;

import java.util.Random;
import java.util.Scanner;

public class b143 {
    public static int numberEnven(int[] arr, int n){
        int number = -1;
        for (int i =0; i < n; i++){
            if(arr[i] % 2 == 0){
                number = arr[i];
                break;
            }
        }
        return number;

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

            int number = numberEnven(arr, n);
            System.out.printf("\nSo chan dau tien: %d",number);

        }
    }
}
