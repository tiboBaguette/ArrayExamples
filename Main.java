package be.vdab;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangel1 = new Rectangle(4, 40);
        Rectangle rectangel2 = new Rectangle(3.5, 35.9);

        System.out.println(rectangel1.toString());
        System.out.println("area = " + rectangel1.getArea());
        System.out.println("perimeter = " + rectangel1.getPerimeter());

        System.out.println(rectangel2.toString());
        System.out.println("area = " + rectangel2.getArea());
        System.out.println("perimeter = " + rectangel2.getPerimeter());
    }
}
