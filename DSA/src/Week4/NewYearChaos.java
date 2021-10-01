package Week4;

import edu.princeton.cs.algs4.StdIn;

public class NewYearChaos {
    public static int chaos(int[] a, int[] b) {
        int n = a.length;
        int c = 0;
        for (int i = n-1; i >= 0; i--) {
            int bribe = 0;
            while (a[i] != b[i]) {
                int tmp = b[i];
                b[i] = b[i-1];
                b[i-1] = tmp;
                bribe += 1;
                c += 1;
                i--;
                if (bribe > 2) {
                    bribe = 0;
                    return bribe;
                }
            }

        }
        return c;

    }
    public static void main(String[] args) {
        int N = StdIn.readInt();
        int[] arr = new int[N];
        int[] brr = new int[N];
        for (int i = 0; i < N; i++)
        {
            brr[i] = i+1;
            arr[i] = StdIn.readInt();
        }
        if (chaos(arr, brr) == 0) {
            System.out.println("Too chaotic");
        }
        else {
            int T = chaos(arr,brr);
            System.out.println(T);
        }

    }
}
