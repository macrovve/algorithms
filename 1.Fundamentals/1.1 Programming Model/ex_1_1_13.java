import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class ex_1_1_13 {
    static public void main(String[] args) {

        int M = 8;
        int N = 10;
        int[][] array = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++)
                array[i][j] = StdRandom.uniform(M);
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                StdOut.printf("%2d ", array[i][j]);
            }
            StdOut.println();
        }
        StdOut.println();

        for (int j = 0; j < N; j++) {
            for (int i = 0; i < M; i++) {
                StdOut.printf("%2d ", array[i][j]);
            }
            StdOut.println();
        }
    }
}
