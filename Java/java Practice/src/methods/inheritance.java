package methods;
class madhu3
{
    public int cal(int x,int y)//parent
    {
        //int k=5;
        return x+y;
    }
}
class madhu4 extends madhu3//child
{
    public int cal_adv(int x,int y){
       // int sum=k+6;
        madhu4 S=new madhu4();
        return x-y;
    }

}
class madhu8 extends madhu4{
    public int cal2(int x,int y)
    {
        return x*y;
    }
}
class madhu10 extends madhu8{
    public int cal3(int x,int y)
    {
        return x/y;
    }
}
public class inheritance {
    public static void main(String[] args) {

       // madhu4 M=new madhu4();
       // madhu8 M1=new madhu8();
        madhu10 M2=new madhu10();
       // madhu4 S=new madhu4();
        System.out.println(M2.cal(4,5));
        //System.out.println(M2.cal_adv(4,5);
        System.out.println(M2.cal2(5,7));
        System.out.println(M2.cal3(8,2));
    }
}
