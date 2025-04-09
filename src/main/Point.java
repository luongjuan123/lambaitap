package main;

import java.lang.Math;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;



public class Point {
    private int x;
    private int y;

    public Point() {
        x = 0;
        y = 1;
    }
    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void read() {
        Scanner sc = new Scanner (System.in);
        x = sc.nextInt(); y = sc.nextInt();
    }

    //Getter Setter
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

    // End Getter Setter


    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }
    public double distance () {
        double dis = Math.sqrt(x * x + y * y);
        return dis;
    }
    public double distance (Point other) {
        double dis = Math.sqrt((x - other.x) * (x - other.x) + (y - other.y) * (y - other.y) );
        return dis;
    }




    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
