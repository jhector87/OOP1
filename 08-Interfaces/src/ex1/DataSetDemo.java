package ex1;

public class DataSetDemo {

    public static void main(String[] args) {
        DataSet ds = new DataSet();
        ds.add(new Table(3, 1));
        ds.add(new Table(1, 0.75));
        ds.add(new Table(2.25, 1));

        Shape max = ds.getMax();
        System.out.println("Largest table - Area: " + max.getArea());
        // Casting to convert the measurable to work
        System.out.println("Largest table - Length: " + ((Table) max).getLength());
        // Casting to convert the measurable to work
        System.out.println("Largest table - Width: " + ((Table) max).getWidth());
        // Casting to convert the measurable to work
        System.out.println("Largest table - Average: " + ds.getAverage());

        Shape min = ds.getMin();
        System.out.println("Smallest table - Area: " + min.getArea());
        System.out.println("Smallest table - Length:" + ((Table) min).getLength());
        System.out.println("Smallest table - Width:" + ((Table) min).getWidth());
        // Casting to convert the measurable to work
        System.out.println("Largest table - Average: " + ds.getAverage());


    }
}
