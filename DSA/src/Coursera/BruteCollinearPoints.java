package Coursera;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BruteCollinearPoints {
    private Point[]points;
    private LineSegment[]segments;
    private int lineSegmentcount;
    public BruteCollinearPoints(Point[] points) {
        if (points == null) {
            throw new IllegalArgumentException();
        }
        for (int k = 0; k < points.length; k++) {
            if (points[k] == null) {
                throw new IllegalArgumentException();
            }
            for (int j = k + 1; j < points.length; j++) {
                if(points[k].compareTo(points[j]) == 0) {
                    throw new IllegalArgumentException();
                }
            }
        }
        lineSegmentcount = 0;
        segments = new LineSegment[2];
        this.points = points.clone();
        Arrays.sort(this.points);
        for (int p = 0; p < this.points.length - 3; p++) {
            for (int q = p + 1; q < this.points.length - 2; q++) {
                for (int r = q + 1; r < this.points.length - 1; r++) {
                    for (int s = r + 1; s < this.points.length; s++) {
                        if (this.points[p].slopeTo(this.points[q]) == this.points[p].slopeTo(this.points[r]) && this.points[p].slopeTo(this.points[q]) == this.points[p].slopeTo(this.points[s]) ) {
                            addLineSegarray(new LineSegment(this.points[p], this.points[s]));
                            this.points[p].drawTo(this.points[s]);
                            StdDraw.show();
                        }
                    }
                }
            }
        }
    }   // finds all line segments containing 4 points

    private void addLineSegarray(LineSegment lineSegment) {
        if (lineSegment == null) {
            throw new IllegalArgumentException();
        }
        if (segments.length == lineSegmentcount) {
            resize(2*segments.length);
        }
        segments[lineSegmentcount] = lineSegment;
        lineSegmentcount = lineSegmentcount + 1;

    }

    private void resize(int j) {
        assert j >= lineSegmentcount;
        LineSegment[]tmp = new LineSegment[j];
        System.arraycopy(this.segments, 0, tmp, 0, this.lineSegmentcount);
        segments = tmp;

    }

    public int numberOfSegments() {
        return lineSegmentcount;
    }       // the number of line segments
    public LineSegment[] segments() {
        return Arrays.copyOf(segments, lineSegmentcount);
    }
    // the line segments

}