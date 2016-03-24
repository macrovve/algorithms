import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class ex_1_1_28_Remove_duplicates {
    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid])
                hi = mid - 1;
            else if (key > a[mid])
                lo = mid + 1;
            else
                return mid;
        }
        return -1;
    }

    public static int[] deleteSame(int[] a) {
        int[] arrayTmp = new int[a.length];
        int indexT = 0;
        arrayTmp[indexT] = a[0];

        for (int i = 0; i < a.length; ++i) {
            if (arrayTmp[indexT] != a[i]) {
                ++indexT;
                arrayTmp[indexT] = a[i];
            }
        }
        return arrayTmp;
    }

    public static void main(String[] args) {
        int[] array = new In(args[0]).readAllInts();
        Arrays.sort(array);

        int[] whitelist = deleteSame(array);
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (rank(key, whitelist) < 0)
                StdOut.println(key);
        }
    }
}

