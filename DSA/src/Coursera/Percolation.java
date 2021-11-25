package Coursera;

import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {
    private final int top = 0;
    private boolean[][] boxopened;
    private final int bottom;
    private final WeightedQuickUnionUF wqf;
    private int length;
    private int count;

    /**
     * Constructor
     * @param n row, col size.
     */
    public Percolation(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException();
        }
        length = n;
        bottom = n * n + 1;
        boxopened = new boolean[length][length];
        wqf = new WeightedQuickUnionUF(length*length + 2);
        count = 0;
    }
    /**
     * opens the site (row, col) if it is not open already.
     * @param row of box.
     * @param col of box.
     */
    public void open(int row, int col) {
        checkException(row, col);
        boxopened[row-1][col-1] = true; //open the box
        count = count + 1;

        if (row == 1) {
            wqf.union(IndexoftheBox(row, col), top);
        }
        if (row == length) {
            wqf.union(IndexoftheBox(row, col), bottom);
        }
        if (row > 1 && isOpen(row - 1, col)) {
            wqf.union(IndexoftheBox(row, col), IndexoftheBox(row -1, col));
        }
        if (row < length && isOpen(row + 1, col)) {
            wqf.union(IndexoftheBox(row, col), IndexoftheBox(row + 1, col));
        }
        if (col > 1 && isOpen(row, col - 1)) {
            wqf.union(IndexoftheBox(row, col), IndexoftheBox(row, col - 1));
        }
        if (col < length && isOpen(row, col + 1)) {
            wqf.union(IndexoftheBox(row, col), IndexoftheBox(row, col + 1));
        }


    }

    /**
     * return index of the box.
     * @param row of the box.
     * @param col of the box.
     * @return index of the box.
     */
    private int IndexoftheBox(int row, int col) {
        return length * (row -1) + col;
    }

    private void checkException(int row, int col) {
        if (row < 1 || row > length  || col < 1 || col > length) {
            throw new IllegalArgumentException();
        }
    }

    /**
     * check if this box is opened.
     * @param row of the box.
     * @param col of the box.
     * @return true if opened false if is not.
     */
    public boolean isOpen(int row, int col) {
        checkException(row, col);
        return boxopened[row-1][col-1];
    }

    /**
     * is the site (row, col) full?.
     * @param row of the box.
     * @param col of the box.
     * @return true if full false if not.
     */
    public boolean isFull(int row, int col) {
        if ((row > 0 && row <= length) && (col > 0 && col <= length)) {
            return wqf.find(top) == wqf.find(IndexoftheBox(row, col));
        } else throw new IllegalArgumentException();
    }
    /**
     * the number of open sites.
     * @return the number of open sites.
     */
    public int numberOfOpenSites() {
        return count;
    }
    /**
     * does the system percolate?.
     * @return true/false.
     */
    public boolean percolates() {
        return wqf.find(top) == wqf.find(bottom);
    }


}
