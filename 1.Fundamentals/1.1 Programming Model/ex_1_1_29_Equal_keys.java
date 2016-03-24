import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class ex_1_1_29_Equal_keys {
    public static int rankBS(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo < hi) {
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

    public static int rank(int key, int[] a) {
        int index = rankBS(key, a);
        while (a[index] == key)
            --index;
        return index + 1;
    }

    public static int count(int key, int[] a) {
        int index = rank(key, a);
        int Tmp = index;
        while (a[Tmp] == key)
            ++Tmp;
        return Tmp - index;
    }

    public static void main(String[] args) {
        int[] whitelist = new In(args[0]).readAllInts();
        Arrays.sort(whitelist);
        int key = Integer.parseInt(args[1]);

        StdOut.printf("The num smaller than %d is %d\n", key, rank(key, whitelist));
        StdOut.printf("The num that equal to %d is %d\n", key, count(key, whitelist));
    }
}

