package methods;

public class cal_method {
//    public  static void mul(int M,int N){
//
//        {
//            System.out.println(M * N);
//        }
//    }

    public  static int mul(int M,int N){
        int c;
        c=M-N;
        return c;

    }

    public static void main(String[] args) {
           int K; int J; int L;
       K= mul(15,5); J= mul(100,20); L=mul(25,5);
        System.out.println(K);
        System.out.println(J);
        System.out.println(L);
    }
}
