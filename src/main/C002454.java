package main;

import main.ColorPoint;
public class C002454 {
    public void TestCase1() {
        ColorPoint A = new ColorPoint(5, 10, "white");
        System.out.println(A);
    }
    public void TestCase2() {
        ColorPoint B = new ColorPoint();
        B.read();
        B.move(10, 8);
        System.out.println(B);
    }
    public void TestCase3() {
        ColorPoint C = new ColorPoint(6, 3, "black");
        ColorPoint D = new ColorPoint(C.getX(), C.getY(), C.getColor());
        System.out.println(D);
        D.setColor("yellow");
        System.out.println(D);

    }
}
