package entities;

public class Rectangle {

    public double width;
    public double height;

    public double areaRectangle() {
        return this.width * this.height;
    }

    public double perimeter() {
        return 2 * (this.width + this.height);
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(this.width, 2) + Math.pow(this.height, 2));
    }

    public String toString() {
        return "AREA = "
                + String.format("%.2f%n", areaRectangle())
                + "PERIMETER = "
                + String.format("%.2f%n", perimeter())
                + "DIAGONAL = "
                + String.format("%.2f", diagonal());
    }

}
