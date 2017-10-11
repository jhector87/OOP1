package FunDataTypesCE;

public class BoatTester {
    public static void main(String[] args) {
        BoatEx1 myBoat = new BoatEx1(0, 0, 30);
        myBoat.move(50);

        System.out.println("x postion" + myBoat.getX());
        System.out.println("Expected: 43.301");
        System.out.println("y postion" + myBoat.getY());
        System.out.println("Expected 25.000");
        System.out.println("Direction: " + myBoat.getDirection());
        System.out.println("Expected 30");
    }
}
