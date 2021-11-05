package Week5;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        In in = new In("D:\\Java\\DSA\\src\\Week5\\data");
        int[] array = in.readAllInts();
        int n = array.length;

        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (less(array[j], array[min])) {
                    min = j;
                }
            }
            int tmp = array[i];
            array[i] = array[min];
            array[min] = tmp;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }

        long end = System.currentTimeMillis();
        System.out.println(end - start);

    }

    private static boolean less(int i, int i1) {
        if (i < i1) {
            return true;
        }
        return false;
    }
}
