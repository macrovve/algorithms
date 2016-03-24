import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class ex_1_1_22 {
    public static int rank(int key, int[] a) {
        return rankRecursive(key, a, 0, a.length - 1, 1);
    }
    public static int rankRecursive(int key, int[] a, int lo, int hi, int deep) {
        StdOut.printf("%s %d %d\n", indent(deep,' '), lo, hi);
        if (lo > hi)
            return -1;
        int mid = lo + (hi - lo) / 2;
        if (key > a[mid])
            return rankRecursive(key, a, mid + 1, hi, deep + 1);
        else if (key < a[mid])
            return rankRecursive(key, a, lo, mid - 1, deep + 1);
        else
            return mid;
    }
    public static String indent(int n, char c)
    {
        String s = "";
        for (int i = 0; i < n; ++i)
            s += c;
        return s;
    }

    public static void main(String[] args) {
        int[] whitelist =new In(args[0]).readAllInts();
        Arrays.sort(whitelist);

        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            StdOut.printf("Now search key: %d\n",key);
            if (rank(key, whitelist) < 0)
                StdOut.printf("The key %d isn't in file\n",key);
            StdOut.println();
        }
    }
}
