import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class ex_1_1_5 {
    static public void main(String[] args) {
        double x = StdIn.readDouble();
        double y = StdIn.readDouble();
        if (0 < x && x < 1 && 0 < y && y < 1)
            StdOut.println("true");
        else
            StdOut.println("false");

    }
}
