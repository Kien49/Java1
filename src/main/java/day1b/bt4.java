package day1b;

import java.util.Scanner;

public class bt4 {
    public static void main(String[] args) {
        // Nhập tháng và năm in ra ngày trong tháng
        int month, year;
        Scanner in = new Scanner(System.in);
        System.out.println("nhap thang, nam: ");
        month = in.nextInt();
        year = in.nextInt();

        if(year < 1582){
            System.out.print("Nam khong hop le.");
            System.exit(0);
        }
        if(month < 1 || month > 12){
            System.out.println("thang khong hop le");
            System.exit(0);
        }

        switch (month){
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 ngay");
                break;
            case 2:
                if(year % 4 == 0 && year % 100 !=0 || (year % 400 == 0)){
                    System.out.println("29 ngay");
                }
                else{
                    System.out.println("28 ngay");
                }
                break;
            default:
                System.out.println("31 ngay");
        }
    }
}
