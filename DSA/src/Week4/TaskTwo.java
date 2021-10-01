package Week4;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TaskTwo {
    public static int binarySearch(int[] a, int number) {
        int n = a.length -1;
        int lo = 0;
        while(lo <= n) {
            int mid = (lo + n)/2;
            if(number > a[mid]) {
                lo = mid + 1;
            }
            else if (number < a[mid]) {
                n = mid -1 ;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        //In in = new In("D:\\CTDLVGT\\algs4-data\\4Kints.txt");
        //int[] a = in.readAllInts();
        int N = StdIn.readInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = StdIn.readInt();
        }
        Arrays.sort(a);
        System.out.println(binarySearch(a,3));
    }
}
