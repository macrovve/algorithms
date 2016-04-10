import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

public class ex_1_1_39_Random_matches {
    public static int binarySearch(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            } else
                return mid;
        }
        return -1;
    }

    public static int arrayTest(int N) {
        int[] array1 = new int[N];
        int[] array2 = new int[N];
        for (int i = 0; i < N; ++i) {
            array1[i] = StdRandom.uniform(100000, 999999);
            array2[i] = StdRandom.uniform(100000, 999999);
        }

        Arrays.sort(array2);
        int count = 0;
        for (int i = 0; i < N; ++i) {
            if (binarySearch(array1[i], array2) != -1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int T = Integer.parseInt(args[0]);
        int[] num = {1000, 10000, 100000, 1000000};
        int length = num.length;
        int[] result = new int[length];

        for (int i = 0; i < T; ++i) {
            for (int j = 0; j < length; ++j) {
                result[j] = result[j] + arrayTest(num[j]);
            }
        }

        for (int i = 0; i < length; ++i) {
            StdOut.printf("%9d: %.2f\n", num[i], 1.0 * result[i] / T);
        }
    }
}
