package FunDataTypesCE;

public class BoatEx1 {

    private double x, y, angle;

    public BoatEx1(double x, double y, double angle) {
        this.x = x;
        this.y = y;
        this.angle = angle;
    }

    public void move(double distance) {
        x += distance * Math.cos(Math.toRadians(angle));
        y += distance * Math.cos(Math.toRadians(angle));
    }

    public void turn(double degrees) {
        angle += degrees;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getDirection() {
        return angle;
    }


}
