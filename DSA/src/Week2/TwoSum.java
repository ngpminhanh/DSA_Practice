package UnionFind;

import edu.princeton.cs.algs4.In;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args)
    {
        In in = new In("D:\\CTDLVGT\\algs\\algs4-data\\1Kints.txt");
        int[] a = in.readAllInts();
        int n = a.length;
        Arrays.sort(a);
        for(int i = 0; i < n; i++)
        {
            if(a[i]+ a[n-1] == 0)
            {
                System.out.println(a[i] + " " + a[n-1]);
                n--;
            }
            else if(a[i]+ a[n-1] > 0)
            {
                n--;
                i--;
            }
        }
    }
}
