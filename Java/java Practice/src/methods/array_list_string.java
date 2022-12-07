package methods;

import java.util.ArrayList;

public class array_list_string {
    public static void main(String[] args) {
        ArrayList<String> fruits=new ArrayList<String>();
        fruits.add("mango");//o
        fruits.add("apple");//1
        fruits.add("watermelon");//3
        fruits.add(2,"grapes");

        System.out.println(fruits);
        System.out.println(fruits.isEmpty());

    }
}
