import edu.princeton.cs.algs4.StdOut;

public class ex_1_1_30_Array_exercise {
    public static int gcd(int p, int q) {
        if (q == 0)
            return p;
        int r = p % q;
        return gcd(q, r);
    }

    public static boolean isMutex(int i, int j) {
        if (i == 0 || j == 0)
            return false;
        int t = gcd(i, j);
        if (t == 1)
            return true;
        return false;
    }

    public static void main(String[] args) {
        int N = 13;
        boolean[][] array = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (isMutex(i, j)) {
                    array[i][j] = true;
                } else {
                    array[i][j] = false;
                }
            }
        }
        //copy the other half of the array
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                array[j][i] = array[i][j];
            }
        }

        //print result
        StdOut.printf("   ");
        for (int i = 0; i < N; i++) {
            StdOut.printf("%-6d", i);
        }

        for (int i = 0; i < N; i++) {
            StdOut.println();
            StdOut.printf("%2d ", i);
            for (int j = 0; j < N; j++) {
                StdOut.printf("%-5s ", array[i][j]);
            }
        }
    }
}
