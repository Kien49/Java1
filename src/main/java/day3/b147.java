package day3;

import java.util.Random;
import java.util.Scanner;

public class b147 {
    private static double isNumberDuong(double arr[])
    {
        double number = -1 ;
        for (int i =arr.length -1; i<=0 ; i--){
            if(arr[i] > 0){
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
            double[] arr = new double[n];
            Random random = new Random();
            for (int i =0; i< n; i++){
                arr[i] = random.nextDouble(200)-100;
                System.out.printf("%f ",arr[i]);
            }

            double number = isNumberDuong(arr) ;

            System.out.printf("\nSo duong cuoi cung: %.1f", number);

        }
    }
}
