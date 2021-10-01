package Week4;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;

import java.util.Arrays;

public class Pairs {
    public static int pairs(int[] a, int k) {
        int count = 0;
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (k == a[j] - a[i]) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main (String[] args) {
        //int N = StdIn.readInt();
        //int[] a = new int[N];
        In in = new In("D:\\CTDLVGT\\algs4-data\\8Kints.txt");
        int[] a = in.readAllInts();
        int N = a.length;
        /*for (int i = 0; i < N; i++) {
            a[i] = StdIn.readInt();
        } */
        Arrays.sort(a);
        int k = StdIn.readInt();
        System.out.println(pairs(a,k));


    }
}
