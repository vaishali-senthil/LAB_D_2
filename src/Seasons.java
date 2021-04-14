import java.util.Scanner;
public class Seasons {
    public static void main(String args[]) {

        int i =1;
        Scanner scn = new Scanner(System.in);

        while (i !=0) {
           String s = scn.next();
            switch (s) {
                case "january":
                    System.out.print("winter");
                    break;
                case "february":
                    System.out.print("winter");
                    break;
                case "march":
                    System.out.print("spring");
                    break;
                case "april":
                    System.out.print("spring");
                    break;
                case "may":
                    System.out.print("spring");
                    break;
                case "june":
                    System.out.print("summer");
                    break;
                case "july":
                    System.out.print("summer");
                    break;
                case "august":
                    System.out.print("summer");
                    break;
                case "september":
                    System.out.print("autumn");
                    break;
                case "october":
                    System.out.print("winter");
                    break;
                case "november":
                    System.out.print("winter");
                    break;
                case "december":
                    System.out.print("winter");
                    break;
                case "exit":
                    System.exit(0);
                default:

            }

        }
    }
}


