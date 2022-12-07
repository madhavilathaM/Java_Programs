package methods;

public class mo {

    public  static void test()
    {
        System.out.println("Madhavi");
    }
    public  static void test(int M,int N)

    {
        System.out.println(M*N);
    }
    public  static void test(String str)
    {
        System.out.println(str);
    }
    public static void main(String[] args) {

        mo M=new mo();
        M.test();
        M.test(4,5);
        M.test("WELCOME TO JAVA");
    }
}
