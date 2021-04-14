import java.util.Scanner;
public class Recursion {

    //public int n;

    public static void main(String[] args) {
        System.out.println("enter a number");
        Recursion1 r = new Recursion1();
        r.recd();

    }
}
class Recursion1 extends Recursion {
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int n2 = n1;

    void recd() {
        //this.n = n1;
        System.out.println(n1);//1
        n1 = n1 - 1;

        if (n1 == 1) {
            System.out.println(n1);
           while(n2>=n1){
           // this.n = n1;
            System.out.println(n1);
            n1 = n1 + 1;
           }
        }
        if(n1>n2){
            System.exit(0);
        }
        recd();
    }
}
