package day3b_OOP;

public class Dog {
    //thuoc tinh
    int id;
    String name;
    int age;
    String color;


    //Phuong thuc - method - ham
    public void run(){
        System.out.println(name + " Running fast");
    }
    public void sleep(){
        System.out.println(name + " Zzzzzz");
    }
    public void eat(){
        System.out.println(name + " Eat foods");
    }
}
