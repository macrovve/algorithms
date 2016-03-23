import edu.princeton.cs.algs4.StdOut;

public class ex_1_1_20 {
    public static double lnFactorial(int N) {
        if (N == 1)
            return 0;
        return lnFactorial(N - 1) + Math.log(N);
    }

    public static void main(String[] args) {
        int n = 7;
        StdOut.println(lnFactorial(n));
    }
}
