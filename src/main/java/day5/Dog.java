package day5;

public class Dog extends Animal{

    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Dog keu go go");
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.makeSound();

        // lop truu tuong  k truc tiep tao ra doi tuong
        // tao thong qua lop con ke thua cua n

    }
}
