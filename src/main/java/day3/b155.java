package day3;

import java.util.Scanner;

public class b155 {
    public static int giaTriXaNhat(int[] arr, int x){
        int number = Math.abs(arr[0] - x) ;
        int soCanTim = 0;

        for(int i =0; i< arr.length; i++){
            if(Math.abs(arr[i] - x) > number){
                number = Math.abs(arr[i] - x) ;
                soCanTim = arr[i];
            }
        }

        return soCanTim;

    }
    public static void main(String[] args) {
        int[] arr = {24, 45,23,13,43,-12};
        int x;
        System.out.print("Nhap x: ");

        Scanner in =new Scanner(System.in);
        x = in.nextInt();
        int number = giaTriXaNhat(arr, x);
        System.out.printf("Gia tri xa nhat: %d",number);
    }
}
