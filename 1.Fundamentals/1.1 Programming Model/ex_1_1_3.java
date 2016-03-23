import edu.princeton.cs.algs4.StdOut;
import static java.lang.Integer.parseInt;

public class ex_1_1_3 {
    static public void main(String[] args) {
        int a = parseInt(args[0]);
        int b = parseInt(args[1]);
        int c = parseInt(args[2]);
        if (a == b && b == c)
            StdOut.println("equal");
        else
            StdOut.println("not equal");

        if (args[0].equals(args[1]) && args[0].equals(args[2]))
            StdOut.println("equal");
        else
            StdOut.println("not equal");

    }
}
