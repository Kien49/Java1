package day1a;

import java.util.Scanner;

public class example2 {
    public static void main(String[] args) {
/*        int number1, number2;
        Scanner in = new Scanner(System.in);
        System.out.print("number1 =  ");
        number1 = in.nextInt();

        System.out.print("number2 =  ");
        number2 = in.nextInt();

        in.close();

        int sum = number1 + number2;
        System.out.printf("%d + %d = %d",number1, number2, sum);*/

/*        long number1, number2;
        Scanner in = new Scanner(System.in);
        System.out.print("number1 = ");
        number1 = in.nextLong();

        System.out.print("number2 = ");
        number2 = in.nextLong();
        in.close();

        double tbc = (number1+number2)/ 2.0;
        System.out.printf("tbc= %.1f", tbc);*/

        float x, y, z;
        Scanner in = new Scanner(System.in);
        System.out.print("x,y,z lan luot la:  ");
        x = in.nextFloat();
        y = in.nextFloat();
        z = in.nextFloat();

        float tbc = (x+y+z) /3;
        double  tbn =Math.pow((x*y*z), (float)1/3 );

        System.out.printf("tbc la: %.3f \ntbn la: %.3f", tbc, tbn);

    }
}
