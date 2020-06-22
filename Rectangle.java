package be.vdab;

public class Rectangle {
    private double width = 1;
    private double height = 1;

    Rectangle() {

    }

    Rectangle(double widht, double height) {
        this.width = widht;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return this.width * 2 + this.height * 2;
    }

    public String toString() {
        return "width = " + width + ", height = " + height;
    }
}
