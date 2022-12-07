package methods;

public class arrays {
    public static void main(String[] args) {
        int[] i = new int[5];
        i[0] = 1;
        i[1] = 12;
        i[2] = 15;
        i[3] = 45;
        i[4] = 34;
        System.out.println(i.length);
       // System.out.println(i[0]+i[1]);

        for (int j=0;j<i.length-1; j++) {
            System.out.println(i[j]);
        }
    }
}
