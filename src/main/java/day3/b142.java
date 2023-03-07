package day3;

import java.util.Random;
import java.util.Scanner;

public class b142 {
    private static double Min(double[] arr){
        double min = arr[0];
        for (int i =0; i< arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
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
                arr[i] = random.nextDouble(500);
                System.out.printf("%f ",arr[i]);
            }

            double min = Min(arr);

            System.out.printf("\nmin: %.1f",min);

        }
    }

}
