import java.util.Scanner;
public class Arrays1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int[] a = new int[3];
        System.out.println("enter the elements of array a");
        for(int i=0;i< a.length;i++){
            a[i]=scn.nextInt();
        }

        //a[0] = 1;
        //a[1] = 2;
        //a[2] =3;
        int[] b = new int[3];
        System.out.println("enter the elements of array b");
        for(int i=0;i<b.length;i++){
            b[i] = scn.nextInt();
        }

        //b[0] = 2;
        //b[1] = 3;
        //b[2] = 4;

        int[] c = new int[3];
        for (int i =0;i<c.length;i++  ) {
           c[i]=a[i]+b[i];
           System.out.println("sum of array in position "+ i +" is "+ c[i]);

        }



    }

}
