
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class ex_2_1_12 {
    public static void sort(Comparable[] a) {
        int N = a.length;
        int h = 1;
        while (h < N / 3)
            h = 3 * h + 1;

        while (h >= 1) {
            int compareCount = 0;
            for (int i = h; i < N; ++i) {
                for (int j = i; j >= h && less(a[j], a[j - h]); j -= h) {
                    compareCount++;
                    exch(a, j, j - h);
                }
            }
            StdOut.printf("h: %10d count: %10d   ratio: %.4f\n", h, compareCount, (double) compareCount / N);
            h = h / 3;

        }
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static void show(Comparable[] a) {
        for (int i = 0; i < a.length; ++i) {
            StdOut.print(a[i] + " ");
        }
        StdOut.println();
    }

    private static void generate(Comparable[] a) {
        for (int i = 0; i < a.length; ++i) {
            a[i] = StdRandom.uniform(1000);
        }
    }

    public static void main(String[] args) {
        int N = 10;
        for (int i = 2; i < N; ++i) {
            Integer[] a = new Integer[(int) Math.pow(10, i)];
            StdOut.printf("N = %d\n", (int) Math.pow(10, i));
            generate(a);
            sort(a);
//            show(a);
        }
    }
}

