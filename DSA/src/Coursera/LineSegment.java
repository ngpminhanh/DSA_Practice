package Coursera;

import Coursera.Point;

public class LineSegment {
    private Point p;
    private Point q;
    public LineSegment(Point p, Point q) {
        if (p == null || q == null) {
            throw new IllegalArgumentException("argument to Coursera.LineSegment constructor is null");
        }
        if (p.equals(q)) {
            throw new IllegalArgumentException("both arguments to Coursera.LineSegment constructor are the same point: " + p);
        }
        this.p = p;
        this.q = q;
    }       // constructs the line segment between points p and q
    public void draw() {
        p.drawTo(q);
    }                       // draws this line segment
    public String toString() {
       return p + " -> " + q;
    }               // string representation
}