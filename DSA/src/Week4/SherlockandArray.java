package Week4;

import edu.princeton.cs.algs4.StdIn;

public class SherlockandArray {
    public static int leftandrightequal(int[] a)
    {
        int n = a.length - 1;
        int lo = 0;
        if(n == 0) {
            return 1;
        }
        else {
            int mid = (lo + n)/2;
            while(0 <= mid && mid <= a.length -1) {
                int l = 0, r = 0;
                for (int i = 0; i < mid; i++) {
                    l += a[i];
                }
                for (int j = mid + 1; j <= a.length -1; j++) {
                    r += a[j];
                }
                if (mid == 0) {
                    if (r == 0) {
                        return 1;
                    }
                    else {
                        return 0;
                    }
                }
                else if (mid == a.length-1) {
                    if(l == 0) {
                        return 1;
                    }
                    else {
                        return 0;
                    }
                }
                if (l == r) {
                    return 1;
                }
                else if (l < r)
                {
                   mid++;

                }
                else {
                    mid--;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int T = StdIn.readInt();
        for (int i = 0; i < T; i++) {
            int m = StdIn.readInt();
            int[] a = new int[m];
            for (int j = 0; j < m; j++) {
                a[j] = StdIn.readInt();
            }
            if(leftandrightequal(a) == 1) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }

    }
}
