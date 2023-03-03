package day2;

import java.util.Scanner;

public class forExample {
    public static void main(String[] args) {
/*        for(int i = 0; i < 10; i++) {
            System.out.print(i + "\t");
        }*/
        int a,b;
        System.out.print("Nhap a,b: ");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        in.close();

        if(a >= b){
            System.out.print("Khong TM");
        } else {
/*            if(a % 2 ==0){
                for(int i =a; i <= b; i+=2) {
                    System.out.print(i + "\t");
                }
            } else{
                for(int i =a+1; i <= b; i+=2) {
                    System.out.print(i + "\t");
                }
            }*/

            int count =0;
            for(int i =a+1; i < b; i++) {
                if(i % 2 != 0){
                    count ++;
                }
            }
            System.out.print(count);
        }

    }

}


