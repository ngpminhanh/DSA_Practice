package Week6;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdArrayIO;
import edu.princeton.cs.algs4.StdOut;

public class Task1_InsertionTest {
    public static void sort(int[] a) {
        int n = a.length;
        for(int i = 0; i < n; i++) {
            for(int j = i; j > 0; j--) {
                if (less(a[j], a[j-1])) {
                    exc(a, j, j-1);
                }
            }
        }
    }

    private static boolean less(int i, int i1) {
        if (i < i1) {
            return true;
        }
        return false;
    }

    private static void exc(int[] a, int j, int i) {
        int swap = a[j];
        a[j] = a[i];
        a[i] = swap;
    }
    public static void print(int[] a) {
        int n = a.length;
        StdOut.println(n);
        for (int i = n-1; i > 0; i--) {
            StdOut.printf("%9d ", a[i]);
        }
        StdOut.println();
    }



    public static void main(String[] args) {
        In in = new In("D:\\Java\\DSA\\src\\Week6\\reverse_data_32Kints"); // tạo luồng đọc từ file
        int[] a = in.readAllInts();  // đọc toàn bộ file vào mảng a
        long start = System.currentTimeMillis();
        sort(a);
        long end = System.currentTimeMillis();  // thời gian chạy bằng end - start
        System.out.println(end - start);
        //print(a); // in mảng ra màn hình
        // 4 kints = sorted-data1
        // 32 kints = sorted data 3

    }
}