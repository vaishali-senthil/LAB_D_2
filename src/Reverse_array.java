import java.util.Scanner;
public class Reverse_array {
   public static void main(String args[]){
      Scanner scn = new Scanner(System.in);
      System.out.println("Enter the number values in array:");
      int n = scn.nextInt();
      int[] a = new int[n] ;
      int i;

      for(i=0;i<n;i++) {
         a[i] = scn.nextInt();
      }
      System.out.println("array elements are:");
      for(i=0;i<n;i++){
          System.out.println(a[i]);
      }
       System.out.println("elements of array  in reverse order");
      for(i=n-1;i>=0;i--){
          System.out.println(a[i]);
      }




   }
}

/*public class Reverse_array {
    public static void main(String[] args) {
        //Initialize array
        int [] arr = new int [] {1, 2, 3, 4, 5};
        System.out.println("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Array in reverse order: ");
        //Loop through the array in reverse order
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}*/