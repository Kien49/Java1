package day3b_OOP;

import java.util.Scanner;

public class Example_OOp {
    public static void main(String[] args) {
/*        //Tao doi tuong
        Dog d1 = new Dog();
        d1.id =1;
        d1.name = "Pitbull";
        d1.color = "Black";
        d1.age =2;

        //Hanh vi
        d1.eat();
        d1.run();*/

        // Tao doi tuong d2
        Dog d = new Dog();
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap id, name, age, color of dog: ");

        d.id = Integer.parseInt(in.nextLine());
        d.name = in.nextLine();
        d.age = Integer.parseInt(in.nextLine());
        d.color = in.nextLine();

        //Hanh vi
        d.eat();
        d.run();
        d.sleep();
    }
}
