import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

public class ex_2_1_17_Insertion {
    public static final int randomScale = 1000;

    public static void sort(Double[] a) {
        int N = a.length;
        for (int i = 1; i < N; ++i) {
            for (int j = i; j > 0 && less(a[j], a[j - 1]); --j) {
                exch(a, j, j - 1);
                show(a);
            }
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

    private static void show(Double[] a) {
        int N = a.length;
        StdDraw.clear();
        StdDraw.setXscale(0, 1);
        StdDraw.setYscale(0, randomScale);
        for (int i = 0; i < N; ++i) {
            double x = 1.0 * i / N;
            double y = a[i] / 2.0;
            double rw = 0.5 / N;
            double rh = a[i] / 2.0;
            StdDraw.filledRectangle(x, y, rw, rh);
        }
        StdDraw.show(100);
    }

    public static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; ++i) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int N = 100;
        Double[] a = new Double[N];
        for (int i = 0; i < N; ++i) {
            a[i] = StdRandom.uniform(0.0, randomScale);
        }
        sort(a);
        assert isSorted(a);
        show(a);
    }
}
