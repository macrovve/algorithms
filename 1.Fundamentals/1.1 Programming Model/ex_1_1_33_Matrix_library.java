import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class ex_1_1_33_Matrix_library {
    public static double dot(double[] x, double[] y) {
        if (x.length != y.length) {
            throw new RuntimeException("Illegal vector norm.");
        }
        double result = 0;
        for (int i = 0; i < x.length; ++i) {
            result += x[i] * y[i];
        }
        return result;
    }

    public static double dot(double x, double[] y) {
        double result = 0;
        for (int i = 0; i < y.length; ++i) {
            result += x * y[i];
        }
        return result;
    }

    public static double[][] transpose(double[][] a) {
        int row = a.length;
        int column = a[0].length;
        double[][] b = new double[column][row];
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < column; ++j) {
                b[j][i] = a[i][j];
            }
        }
        return b;
    }

    public static double[][] mult(double[][] a, double[][] b) {
        int rowA = a.length;
        int rowB = b.length;
        int columnA = a[0].length;
        int columnB = b[0].length;
        if (columnA != rowB) {
            throw new RuntimeException("Illegal matrix dimensions");
        }
        double[][] result = new double[rowA][columnB];
        for (int i = 0; i < rowA; ++i) {
            for (int j = 0; j < columnB; ++j) {
                result[i][j] = dot(a[i], transpose(b)[j]);
            }
        }
        return result;
    }

    public static double[] mult(double[][] a, double[] x) {
        int rowA = a.length;
        int columnA = a[0].length;
        int xLength = x.length;
        if (columnA != xLength)
            throw new RuntimeException("Illegal dimensions or norm");
        double[] result = new double[rowA];

        for (int i = 0; i < rowA; ++i) {
            result[i] = dot(a[i], x);
        }
        return result;
    }

    public static double[] mult(double[] y, double[][] a) {
        int yLength = y.length;
        int rowA = a.length;
        int columnA = a[0].length;
        if (rowA != yLength) {
            throw new RuntimeException("Illegal dimensions or norm");
        }
        double[] result = new double[columnA];
        for (int i = 0; i < columnA; ++i) {
            result[i] = dot(y, (transpose(a)[i]));
        }
        return result;
    }

    public static void show(double[][] a) {
        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < a[0].length; ++j) {
                StdOut.printf("%f ", a[i][j]);
            }
            StdOut.printf("\n");
        }
    }

    public static void show(double[] a) {
        for (int i = 0; i < a.length; ++i) {
            StdOut.printf("%f ", a[i]);
        }
        StdOut.printf("\n");
    }

    public static double[][] randomMatrix(int M, int N, int max) {
        double[][] result = new double[M][N];
        for (int i = 0; i < M; ++i) {
            for (int j = 0; j < N; ++j) {
                result[i][j] = StdRandom.uniform(max);
            }
        }
        return result;
    }

    public static double[] randomVector(int M, int max) {
        double[] result = new double[M];
        for (int i = 0; i < M; ++i) {
            result[i] = StdRandom.uniform(max);
        }
        return result;
    }

    public static void main(String[] args) {
        double[][] a = randomMatrix(4, 5, 10);
        double[][] b = randomMatrix(5, 4, 10);
        double[] c = randomVector(4, 10);
        double[] d = randomVector(5, 10);
        double[] e = randomVector(5, 10);
        StdOut.printf("A:\n");
        show(a);
        StdOut.printf("B:\n");
        show(b);
        StdOut.printf("C:\n");
        show(c);
        StdOut.printf("D:\n");
        show(d);
        StdOut.printf("E:\n");
        show(e);
        StdOut.printf("Transpose A:\n");
        show(transpose(a));
        StdOut.printf("A*B:\n");
        show(mult(a, b));
        StdOut.printf("D*E:\n");
        StdOut.printf("%f\n", dot(d, e));
        StdOut.printf("A*D:\n");
        show(mult(a, d));
        StdOut.printf("C*A:\n");
        show(mult(c, a));


//        double[][] e=mult(a,b);
//        show(e);
//        double[] f=mult(c,a);
//        show(f);
//        double[] g=mult(b,d);
//        show(g);
//        StdOut.printf("%f",dot(c,d));
    }
}

