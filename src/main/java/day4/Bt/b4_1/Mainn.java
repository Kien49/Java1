package day4.Bt.b4_1;

public class Mainn {
    public static void main(String[] args) {
        Cylinderr c1 = new Cylinderr(2, 3);
        // Tinh the tich
        System.out.println(c1.getVolume());
        // Tinh dien tich day??
        System.out.println(c1.getCircle().getArea());

        // Dien tich xung quanh
        System.out.println(c1.getAroundArea());
    }
}
