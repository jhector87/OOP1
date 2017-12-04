package ex2;

public class CircularTable implements Table {

    private double radius;

    public CircularTable(double r) {
        this.radius = r;
    }

    public double getArea() {
        return 2 * radius * Math.PI;
    }

    public String toString() {
        return "CircularTable - Radius: " + radius;
    }
}
