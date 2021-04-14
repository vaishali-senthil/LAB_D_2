import java.util.Scanner;

public class Hobby {
    public static void main(String args[]){

        Scanner scn = new Scanner(System.in);
        int i =1;
       String y = "programming";

        while(i !=0){
            String s = scn.next();
            switch(s) {
                case "dance":
                    System.out.println("u love dancing");
                    break;

                case "music":
                    System.out.println("u love singing");
                    break;

                case "programming":
                    System.out.println("specify the language");
                    break;

                case "python":
                     System.out.println("guido van rossum");
                     break;
                case "java":
                     System.out.println("james gosling");
                     break;

                case "exit":
                    System.exit(0);

                default:
            }

        }
    }
}
