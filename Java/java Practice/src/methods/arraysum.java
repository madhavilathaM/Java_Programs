package methods;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class arraysum {

    public static int prod(int...numbers)
    {
        int sum=0;
        for(int j=0;j<numbers.length;j++){
            sum=sum+numbers[j];
        }return sum;

    }

    public static void main(String[] args) {
System.out.println("enter Array list");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

         arraysum R=new arraysum();
        //int i=R.prod(2,2,2,2,2,2,2,2,2);
System.out.println(R.prod(1,2,3,4));
        //System.out.println(i);
    }
}
