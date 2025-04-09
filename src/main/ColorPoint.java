package main;

import java.util.Scanner;

public class ColorPoint extends Point {
    private String color;


    public ColorPoint() {
        super();
        color = "green";
    }
    public ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    public void read() {
        super.read();
        Scanner sc = new Scanner(System.in);
        color = sc.next();
    }

}
