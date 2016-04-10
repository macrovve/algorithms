import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class ex_1_1_36_Empirical_shuffle_check {
    public static void init(int[] a) {
        for (int i = 0; i < a.length; ++i) {
            a[i] = i;
        }
    }

    public static void main(String[] args) {
        int M = Integer.parseInt(args[0]);
        int N = Integer.parseInt(args[1]);
        int[][] result = new int[M][M];
        int[] a = new int[M];
        for (int i = 0; i < N; ++i) {
            init(a);
            StdRandom.shuffle(a);
            for (int j = 0; j < M; ++j) {
                result[j][a[j]]++;
            }
        }

        for (int i = 0; i < M; ++i) {
            for (int j = 0; j < M; ++j) {
                StdOut.printf("%3d ", result[i][j]);
            }
            StdOut.printf("\n");
        }
    }
}
