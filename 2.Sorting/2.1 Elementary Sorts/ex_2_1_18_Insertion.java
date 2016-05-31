import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

import java.awt.*;

public class ex_2_1_18_Insertion {
    public static final int randomScale = 100;

    public static void sort(Double[] a) {
        int N = a.length;
        int pathFlag = 0;
        for (int i = 1; i < N; ++i) {
            for (int j = i; j > 0 && less(a[j], a[j - 1]); --j) {
                exch(a, j, j - 1);
                pathFlag = j - 1;
            }
            show(a, i, pathFlag);
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

    private static void show(Double[] a, int i, int pathFlag) {
        int N = a.length;
        StdDraw.setXscale(0, 1);
        StdDraw.setYscale(0, N);
        for (int j = 0; j < N; ++j) {
            if (pathFlag <= j && j <= i)
                StdDraw.setPenColor(Color.RED);
            else
                StdDraw.setPenColor(Color.DARK_GRAY);
            double x = 1.0 * j / N;
            double y = a[j] / 2.0 / randomScale + i - 1;
            double rw = 0.5 / N;
            double rh = a[j] / 2.0 / randomScale;
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
        int N = 10;
        Double[] a = new Double[N];
        for (int i = 0; i < N; ++i) {
            a[i] = StdRandom.uniform(0.0, randomScale);
        }
        sort(a);
        assert isSorted(a);
    }

}
