package Entities;

public class Rectangle {

    public double width;
    public double height;

    public double Area() {
        return (this.width * this.height);
    }

    public double Perimeter() {
        return (2 * (this.width + this.height));
    }

}
