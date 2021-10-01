package Week4;

import edu.princeton.cs.algs4.StdIn;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class ClosetNumber {
    public static void closetnumber(int[] a) {
        int min = a[1] - a[0];
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i + 1] - a[i] < min) {
                min = a[i + 1] - a[i];
            }
        }
        List<Integer> array = new Vector<>();
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i + 1] - a[i] == min) {
                array.add(a[i]);
                array.add(a[i + 1]);
            }
        }
        System.out.println(array);
    }



    public static void main (String[] args) {

        int N = StdIn.readInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = StdIn.readInt();
        }
        Arrays.sort(a);
        closetnumber(a);


    }
}
