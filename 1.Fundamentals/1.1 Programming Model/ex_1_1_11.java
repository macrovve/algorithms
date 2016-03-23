import edu.princeton.cs.algs4.StdOut;

public class ex_1_1_11 {
    static public void main(String[] args) {
        boolean[][] array = {
                {true, true, false},
                {true, false, true},
                {false, true, false}};

        for (int i = 0; i < 3; i++) {
            StdOut.printf("%d: ", i);
            for (int j = 0; j < 3; j++) {
                if (array[i][j])
                    StdOut.printf("*");
                else
                    StdOut.printf(" ");
            }
            StdOut.println();
        }
    }
}