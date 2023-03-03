package day1a;

import java.util.Scanner;

public class bt3 {
    public static void main(String[] args) {
        int a, b;
        System.out.print("Nhap a,b: ");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        in.close();

        int soDu = a % b;
        System.out.printf("%d chia %d co so du la: %d" ,a,b,soDu);

    }
}
