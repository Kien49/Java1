package day2;

import java.util.Scanner;

public class b1a {
    public static void main(String[] args) {
        String admin = "";
        String passWord = "";
        Scanner in = new Scanner(System.in);

        int count =3;
        while (true){
            System.out.print("\nNhap Username: ");
            admin = in.nextLine();
            System.out.print("Nhap PassWord: ");
            passWord = in.nextLine();
            count --;

            if(count >0){
                if(admin.equalsIgnoreCase("admin") && passWord.equalsIgnoreCase("admin")){
                    System.out.print("Dang nhap thanh cong, ban gioi vllllllllll");
                    break;
                }
                System.out.printf("Nhap sai. Ban con %d lan nhap",count);
            } else{
                System.out.print("Dang nhap that bai. Ban ngu vlllllllllll");
                break;
            }
        }
        in.close();
    }
}
