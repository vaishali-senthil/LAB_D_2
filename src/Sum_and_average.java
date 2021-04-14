import java.util.Scanner;
public class Sum_and_average {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        //int a [] = new int[];
        int i,sum=0;
        System.out.println("enter the number of elements for array:");
        int n = scn.nextInt();
        int a[] = new int[n];
        for(i=0;i<n;i++){
            a[i] = scn.nextInt();
            sum = sum+a[i];

        }
        for(i=0;i<n;i++){
            System.out.println(a[i]);
        }
        float average = (float) sum/n;

        System.out.println("sum:"+sum+",average:"+average);

    }
}
