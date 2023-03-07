package day3;

import java.util.Scanner;

public class functionExample {

    private static void inChuoiVietHoa(String s){
        s = s.toUpperCase();
        System.out.printf("Viet hoa: %s\n",s);
    }
    public static void main(String[] args) {
        String S = "";
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        S = in.nextLine();
        inChuoiVietHoa(S);

    }
}
