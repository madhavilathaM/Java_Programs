package methods;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class mo1 {
    public static void test()
    {
             System.out.println("WELCOME TO OVERLOADING METHOD");
    }
    public static void test(int A,int B)
    {
        System.out.println("multification"+ (A*B));
    }
//    public static void test2(int K,int L)
//    {
//        System.out.println("addition"+ (K+L));
//    }
//    public static void test4(int n)//star pattern
//    {
//        for(int i=1;i<=n;i++)
//        {
//            for(int j=i;j<=n;j++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
    public static void test(String str)
    {
        System.out.println(str);
    }

//    public static <arr> void test5(String name[] )
//    {
//
//        System.out.println(name.length);
//        for(int i=0;i<name.length;i++)
//        {
//            System.out.println(name[i]);
//        }
//    }

    public static void main(String[] args) throws IOException {
        int A; int B; String str;
        //String name[]={"madhavi","latha","lekha","moolya","babu"};
        System.out.println("Enter any two Numbers");
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
             A=Integer.parseInt(br.readLine());
            B=Integer.parseInt(br.readLine());
            System.out.println("Any String");
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        mo1 M=new mo1();
        M.test();
        M.test(A,B);
//        M.test2(A,B);
        M.test(str);
//        M.test4(A);
        //M.test5(name);
    }
}
