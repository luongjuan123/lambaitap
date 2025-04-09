package main;

import main.Point;
import java.util.Collections;
import java.util.Comparator;



public class LineSegment {
    private Point d1;
    private Point d2;

    public LineSegment() {
        d1 = new Point(5, 8);
        d2 = new Point(1, 0);
    }
    public LineSegment(int x1, int y1, int x2, int y2) {
        d1 = new Point(x1, y1);
        d2 = new Point(x2, y2);
    }
    public LineSegment(LineSegment other) {
        this.d1 = new Point(other.d1.getX(), other.d1.getY());
        this.d2 = new Point(other.d2.getX(), other.d2.getY());
    }
    public LineSegment(Point d1, Point d2) {
        this.d1 = new Point(d1.getX(), d1.getY());
        this.d2 = new Point(d2.getX(), d2.getY());
    }
    public void move(int dx, int dy) {
        this.d1.move(dx, dy);
        this.d2.move(dx, dy);
    }
    public double len() {
        return d2.distance(d1);
    }
    public double angle() {
        double dx = d2.getX() - d1.getX();
        double dy = d2.getY() - d1.getY();
        double length = Math.sqrt(dx * dx + dy * dy);
        if (length == 0) {
            return 0; // hoặc throw exception nếu đoạn thẳng không hợp lệ
        }
        double cosTheta = dx / length;
        return Math.acos(cosTheta); // góc trả về theo radian
    }

    @Override

    public String toString() {
        return "[" + d1.toString() + ", " + d2.toString() + "]";
    }
}
