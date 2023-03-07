package day4.b4_2;

public class MainPerson {
    public static void main(String[] args) {
        Person person = new Person("kien", "HN");

        Student std = new Student(person.getName(), person.getAddress(), "C", 21, 1000);
        System.out.println(std);
    }
}
