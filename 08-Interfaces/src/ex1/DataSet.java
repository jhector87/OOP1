package ex1;

public class DataSet {

    private Shape max, min;
    private int counter;
    private double sum = 0.0;

    public void add(Shape  shape) {
        sum += shape.getArea();
        counter++;
        if (max == null || shape.getArea() > max.getArea()) max = shape;
        if (min == null || shape.getArea() < min.getArea()) min = shape;
    }

    public Shape getMax() {
        return max;
    }

    public Shape getMin() {
        return min;
    }

    public double getAverage() {
        if(counter == 0) return 0;
        return sum / counter;
    }
}
