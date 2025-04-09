package main;

public class PointTest {
    public void main() {
        Point A = new Point(3, 4);
        Point B = new Point(); B.read();
        Point C = new Point(-B.getX(), -B.getY());
        Point O = new Point(0, 0);
        System.out.printf("%.3f \n" ,B.distance(O));
        System.out.printf("%.3f \n" ,B.distance(A));

    }
}
