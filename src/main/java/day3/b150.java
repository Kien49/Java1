package day3;

import java.util.Random;
import java.util.Scanner;

public class b150 {
    private static double maxAm(double arr[],int n)
    {
        double max = 0;
        int tempCount = 0;
        for(int i = 0 ; i < n; i++){
            if(arr[i] < 0){
                if(tempCount == 0){
                    max = arr[i];
                    tempCount ++;
                }else if(max < arr[i]){
                    max = arr[i];
                }
            }

        }
        return max;
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
            double[] arr = new double[n];
            Random random = new Random();
            for (int i =0; i< n; i++){
                arr[i] = random.nextDouble(200)-100;
                System.out.printf("%.1f ",arr[i]);
            }

            double number = maxAm(arr, n);
            System.out.printf("\nGia tri am lon nhat la: %.1f",number);

        }
    }
}
