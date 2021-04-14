import java.util.Scanner;
public class Copy_array {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);

        System.out.println("enter the number of elements for array");
        int n = scn.nextInt();
        int a []= new int[n];
        int b [] = new int[n];
        int i;
        for(i=0;i<n;i++){
            a[i]= scn.nextInt();
        }
        System.out.println("elements in array a");
        for(i=0;i<n;i++){
            System.out.println(a[i]);

        }
        System.out.println("elements in array b copied");
        for(i=0;i<n;i++){
            b[i]=a[i];
        }
        System.out.println("elements in array b ");
        for(i=0;i<n;i++) {
            System.out.println(b[i]);
        }


    }
}
