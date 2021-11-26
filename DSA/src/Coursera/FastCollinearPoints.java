package Coursera;

import Coursera.LineSegment;
import Coursera.Point;

import java.util.Arrays;

public class FastCollinearPoints {
    private Point[] points;
    private LineSegment[]segments;
    private int lineSegmentcount;

    public FastCollinearPoints(Point[] points) {
        if (points == null)
            throw new IllegalArgumentException();

        this.points = points.clone();
        Arrays.sort(points);
        for (int i = 0; i < this.points.length - 1; i++) {
            if (this.points[i].compareTo(this.points[i+1]) == 0) {
                throw new IllegalArgumentException("U have duplicate points");
            }
        }
        segments = new LineSegment[2];
        lineSegmentcount = 0;
        for (int i = 0; i < this.points.length - 3; i++) {
            Arrays.sort(this.points);
            Arrays.sort(this.points, this.points[i].slopeOrder());

            for (int p = 0, left = 1, right = 2; right < this.points.length; right++) {
                // find last collinear to p point
                while (right < this.points.length && this.points[p].slopeTo(this.points[right]) == this.points[p].slopeTo(this.points[left])) {
                    right++;
                }
                // if found at least 3 elements, make segment if it's unique
                if (right - left >= 3 && this.points[p].compareTo(this.points[left])< 0) {
                    addLS(new LineSegment(this.points[p], this.points[right - 1]));
                }
                // Try to find next
                left = right;
            }
        }
        // finds all line segments containing 4 or more points
    }

    private void addLS(LineSegment lineSegment) {
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
        LineSegment []tmp = new LineSegment[j];
        System.arraycopy(this.segments, 0, tmp, 0, this.lineSegmentcount);
        segments = tmp;
    }

    // the number of line segments
    public int numberOfSegments() {
        return lineSegmentcount;
    }

    // the line segments
    public LineSegment[] segments() {
        return Arrays.copyOf(segments, lineSegmentcount);    }

    // test the whole array fo duplicate points

    }

