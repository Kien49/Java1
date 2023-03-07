package day3;

import java.util.Random;
import java.util.Scanner;

public class b146 {
    private static double isNumberAm(double arr[])
    {
        double number = 1 ;
        for (int i =0; i< arr.length; i++){
            if(arr[i] < 0){
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
                arr[i] = random.nextDouble()-100;
                System.out.printf("%f ",arr[i]);
            }

            double number = isNumberAm(arr) ;

            System.out.printf("\nSo am dau tien: %.1f", number);

        }
    }
}
