import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class ex_1_1_14 {
    static public int lg(int N) {
        int i = N;
        while (i * i > N)
            --i;
        return i;
    }

    static public void main(String[] args) {
        int n;
        while (!StdIn.isEmpty()) {
            n = StdIn.readInt();
            StdOut.println(lg(n));
        }
    }
}
