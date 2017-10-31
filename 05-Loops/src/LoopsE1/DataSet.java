package LoopsE1;

public class DataSet {

    private double sum;
    private int count;
    private double smallestNumber;
    private boolean firstValue;

    public DataSet() {
        sum = 0;
        count = 0;
        firstValue = true;
    }

    public void add(double value) {
        sum += value;
        count++;
        if (firstValue) {
            smallestNumber = value;
            firstValue = false;
        }   else {
            if (value < smallestNumber)
                smallestNumber = value;
        }
    }

    public double getAverage() {
        return count > 0 ? sum / count : 0;
    }

    public double getSmallest(){
        return smallestNumber;
    }
}
