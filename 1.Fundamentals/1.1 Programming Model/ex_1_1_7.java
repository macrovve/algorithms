import edu.princeton.cs.algs4.StdOut;

public class ex_1_1_7 {
    static public void main(String[] args) {
        double t = 9.0;
        while (Math.abs(t - 9.0 / t) > .001) {
            t = (9.0 / t + t) / 2.0;
        }
        StdOut.printf("%.5f\n", t);
        //a 3.00009

        int suma = 0;
        for (int i = 1; i < 1000; i++)
            for (int j = 0; j < i; j++)
                suma++;
        StdOut.println(suma);
        //b 499500

        int sumb = 0;
        for (int i = 1; i < 1000; i *= 2)
            for (int j = 0; j < 1000; j++)
                sumb++;
        StdOut.println(sumb);
        //c 10000


    }
}
