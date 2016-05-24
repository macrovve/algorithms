import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class ex_2_1_11 {
    public static void sort(Comparable[] a) {
        int N=a.length;
        //序列(pow(3,k)-1)/2 < N
        int k= (int) (Math.log(2*N+1)/Math.log(3));
        int[] hArray=new int[k];
        for(int i=0;i<k;++i){
            hArray[i]= (int) ((Math.pow(3,k-i)-1)/2);
        }

        while(k>0){
            k--;
            int h=hArray[k];
            for(int i=h;i<N;++i) {
                for (int j = i; j >= h && less(a[j], a[j - h]); j -= h) {
                    exch(a, j, j - h);
                }
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

    private static void show(Comparable[] a) {
        for (int i = 0; i < a.length; ++i) {
            StdOut.print(a[i] + " ");
        }
        StdOut.println();
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
        String[] a = StdIn.readAllStrings();
        sort(a);
        assert isSorted(a);
        show(a);
    }
}


