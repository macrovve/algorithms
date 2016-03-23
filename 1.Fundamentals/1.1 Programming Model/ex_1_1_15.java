import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class ex_1_1_15 {
    static public int[] histogram(int[] a, int M) {
        int[] array = new int[M];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < M)
                array[a[i]]++;
        }
        return array;
    }

    static public void main(String[] args) {
        int N=10;
        int M=10;
        int[] array = new int[N];
        for(int i=0;i<N;i++){
            array[i]= StdRandom.uniform(M);
        }

        for(int i=0;i<N;i++){
            StdOut.printf("%2d ",array[i]);
        }
        StdOut.println();
        int[] h=histogram(array,M);
        for (int i = 0; i < M; i++) {
            StdOut.printf("%2d ",h[i]);
        }
    }
}
