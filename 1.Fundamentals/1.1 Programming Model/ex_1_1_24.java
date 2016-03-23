import edu.princeton.cs.algs4.StdOut;

public class ex_1_1_24 {
    public static int Euclid(int p,int q){
        StdOut.printf("%d %d\n",p,q);
        if(q==0) return p;
        int r=p%q;
        return Euclid(q,r);
    }
    public static void main(String[] args){
        int p=Integer.parseInt(args[0]);
        int q=Integer.parseInt(args[1]);
        Euclid(p,q);
    }
}

//1111111 1234567
//1234567 1111111
//1111111 123456
//123456 7
//7 4
//4 3
//3 1
//1 0

