package Coursera;

import edu.princeton.cs.algs4.StdDraw;

import java.util.Comparator;

public class Point implements Comparable<Point> {
    private final int x;
    private final int y;
    public Point(int x, int y)  {
        this.x = x;
        this.y = y;
    }                       // constructs the point (x, y)

    public void draw() {
        StdDraw.point(x, y);
    }                               // draws this point
    public   void drawTo(Point that) {
        StdDraw.line(x, y, that.x, that.y);
    }               // draws the line segment from this point to that point
    public String toString() {
            return "(" + x + ", " + y + ")";
    }                        // string representation

    public int compareTo(Point that)  {
        if (y == that.y && x == that.x) {
            return 0;
        }
        if (y < that.y || y == that.y && x < that.x) {
            return -1;
        }
        return 1;
    }   // compare two points by y-coordinates, breaking ties by x-coordinates
    public double slopeTo(Point that)  {
        if (y == that.y && x == that.x) {
            return Double.NEGATIVE_INFINITY;
        }
        if (y != that.y && x == that.x) {
            return Double.POSITIVE_INFINITY;
        }
        if (y == that.y && x != that.x) {
            return +0.0;
        }
        return (double) (y - that.y)/(x - that.x);
    }     // the slope between this point and that point
    public Comparator<Point> slopeOrder() {
        return new SlopeOrder();
    }             // compare two points by slopes they make with this point

    private class SlopeOrder implements Comparator<Point>  {
        Point a = Point.this;
        @Override
        public int compare(Point o1, Point o2) {
            if (a.slopeTo(o1) < a.slopeTo(o2)) {
                    return -1;
            }
            if (a.slopeTo(o1) > a.slopeTo(o2)) {
                return 1;
            }
            return 0;
        }
    }
}