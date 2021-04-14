import java.util.Scanner;
public class Swap_arrays {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the number of elements in array:");
        int n = scn.nextInt();
        int i,d=0,e=0,temp=0;
        int a[] = new int[n];
        for(i=0;i<n;i++){
            a[i]= scn.nextInt();
        }
        for(i=0;i<n;i++){
            System.out.println(a[i]);
        }
        System.out.println("enter two positions to swap");
         i =scn.nextInt();
         int j = scn.nextInt();
        //int f;
        if (i==1) {
             d = a[i-1];//1
        }
        if(j==2){
              e = a[j-1]; //2
        }
        temp = d;//1
        d = e;//2
        e = temp;//1
        System.out.println(d);
        System.out.println(e);






    }
}
