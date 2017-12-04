package ex2;

public class RectangularTable implements Table {

    private double length, width;

    public RectangularTable(double lg, double w) {
        this.length = lg;
        this.width = w;
    }

    public double getArea() {
        return length * width;
    }

    public String toString() {
        return "RectangularTable - Length: length" + length + " x " + width;
    }
}
