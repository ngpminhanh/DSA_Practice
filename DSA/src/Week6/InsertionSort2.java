package Week6;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;

public class InsertionSort2 {
    public static void main(String[] args) {
        In in = new In("D:\\Java\\DSA\\src\\Week6\\InsertionSortData2"); // tạo luồng đọc từ file
        int n = in.readInt();
        int[] a = new int[n];
        for(int i =0; i < n; i++) {
            a[i] = in.readInt();
        }

    }
}
