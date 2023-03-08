package day5;

import java.util.Scanner;

public class Try_Catch {
    // Viet 1 chuong trinh tinh thuong a/b . Chuong trinh dung khi tinh duoc phep toan dau tien
    public static void main(String[] args) {
        int a, b;
        Scanner in = new Scanner(System.in);
        while(true){
            try{
                System.out.println("Nhap a,b: ");
                a= in.nextInt();
                b= in.nextInt();
                System.out.printf("thuong: %.1f", a/b);
                break;
            }catch (Exception e){
                System.out.println(e);
            }
        }
        in.close();
    }

}
