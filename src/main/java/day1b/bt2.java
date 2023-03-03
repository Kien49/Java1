package day1b;

import java.util.Scanner;
public class bt2 {
    public static void main(String[] args) {
        int x;
        System.out.print("Nhap nam: ");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        in.close();
        if(x < 1582){
            System.out.print("Khong hop le.");
            System.exit(0);
        }
        if(x >= 1582){
            if(x % 4 == 0 && x % 100 !=0 || (x % 400 == 0)){
                System.out.printf("%d la nam nhuan.", x);
                System.exit(0);
            }
            System.out.printf("%d la nam khong nhuan",x);

        }

    }
}
