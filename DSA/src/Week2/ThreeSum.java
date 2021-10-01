package UnionFind;

import edu.princeton.cs.algs4.In;

import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args)
    {
        In in = new In("D:\\CTDLVGT\\algs4-data\\1Kints.txt");
        int[] a = in.readAllInts();
        int n = a.length;
        Arrays.sort(a);
        for(int i = 0; i < n; i++)
        {
            int m = n;
            for(int j = i; j < m; j++)
            {
                if(a[j] + a[m-1] + a[i] == 0)
                {
                    System.out.println(a[i] + " " + a[j] + " " + a[m-1]);
                    m--;
                }
                else if(a[j] + a[m-1] + a[j] > 0)
                {
                    m--;
                    j--;

                }
            }
        }
    }
}
