package methods;

public class radius {
 public static void area(int r)
 {
  double arg=3.14*r*r;
  System.out.println(arg);
 }
public static void area(int r,String S)
{
    double per=2*3.14*r;
    System.out.println(per);
}
    public static void main(String[] args) {
     radius R=new radius();
     R.area(4);
     R.area(4,"dekdk");


    }
}
