package UnionFind;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.UF;

public class UFClient2 {
    public static void main(String[] args)
    {
        int N = StdIn.readInt();
        int n = 0;
        UF uf = new UF(N);
        while(!StdIn.isEmpty())
        {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            n++;
            if(!uf.connected(p,q))
            {
                uf.union(p,q);
                if(uf.count() == 1)
                {
                    System.out.println(n);
                    break;
                }
            }


        }
        if(uf.count()!= 1) {System.out.println("FAILED");}
    }
}
