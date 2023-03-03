package day2;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        // Nhập chuỗi từ bàn phím in ra chữ hoa. Nhập exit thì end
/*        String S = "";
        Scanner in = new Scanner(System.in);

        while (true){
            System.out.print("Nhap chuoi: ");
            S = in.nextLine();
            if(S.equalsIgnoreCase("exit")){

                break;
            }
            S = S.toUpperCase();
            System.out.printf("Viet hoa: %s\n",S);
        }
        in.close();*/
        int i = 1;
        while ( i <= 10){
            System.out.printf("%d ",i);
            i++;

        }

    }
}
