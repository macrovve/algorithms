import edu.princeton.cs.algs4.StdOut;

public class ex_1_1_9 {
    static public void main(String[] args) {
        int N = 5;
        StdOut.println(Integer.toBinaryString(N));
        String S = "";
        for (int n = N; n > 0; n /= 2)
            S = (n % 2) + S;
        StdOut.println(S);
    }
}
