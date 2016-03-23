import edu.princeton.cs.algs4.StdOut;

public class ex_1_1_19 {
    public static void main(String[] args) {
        long[] f = new long[50];
        f[0] = 0;
        f[1] = 1;
        int n = 2;
        while (n < 50) {
            f[n] = f[n - 1] + f[n - 2];
            ++n;
        }
        StdOut.println("Fibonacci");
        for (int i = 0; i < 50; i++) {
            StdOut.println(f[i]);
        }

    }

}
