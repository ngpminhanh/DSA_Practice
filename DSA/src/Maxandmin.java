import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Maxandmin {
    public static void main(String[] args) {
        int max = StdIn.readInt();
        int min = max;
        while (!StdIn.isEmpty()) {
            int value = StdIn.readInt();
            if (value > max) max = value;
            if (value < min) min = value;
        }
        StdOut.println("maximum  = " + max + ", minimum = " + min);
    }
}
