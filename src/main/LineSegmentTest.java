package main;

import java.util.Scanner;
import java.util.ArrayList;
import main.Point;
import main.LineSegment;
import java.util.Collections;
import java.util.Comparator;

class SortLine implements Comparator {


    @Override
    public int compare(Object o1, Object o2) {
        LineSegment a = (LineSegment) o1;
        LineSegment b = (LineSegment) o2;
        int l1 = (int)((LineSegment) o1).len();
        int l2 = (int)((LineSegment) o2).len();
        return l1 - l2;

    }
}

public class LineSegmentTest {
    public void TestCase1() {
        Point A = new Point(2, 5);
        Point B = new Point(20, 35);
        LineSegment AB = new LineSegment(A, B);
        AB.move(35, 51);
        System.out.println(AB);
    }
    public void TestCase2() {
        LineSegment CD = new LineSegment(2, 33, -9, 27);
        double CD_len = CD.len();
        System.out.printf("%.3f", CD_len);
        System.out.println();
    }
    public void TestCase3() {
        Comparator cmp = new SortLine();
        Scanner sc = new Scanner(System.in);
        int n; n = sc.nextInt();
        ArrayList<LineSegment> ls = new ArrayList<LineSegment>();
        for (int i = 0; i < n; i ++) {
            Point A = new Point(); Point B = new Point();
            A.read(); B.read();
            LineSegment tmp =  new LineSegment(A, B);
            ls.add(tmp);
        }
        Collections.sort(ls, cmp);
        for (LineSegment l : ls) {
            System.out.println(l);
        }
    }
}
