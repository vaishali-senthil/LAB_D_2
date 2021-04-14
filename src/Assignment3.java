import java.io.*;

public class Assignment3 {
    public static void main(String args[]) throws IOException{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        // Reading data using readLine
        String str = reader.readLine();
        writer.write(str);
        writer.newLine();
        writer.flush();
        str = str.toLowerCase();


        writer.write("replacing CharSequence:");
        writer.newLine();
        writer.flush();


        String s1=str.replace("string","CharSequence");
        s1=s1.replace("String","CharSequence");

        writer.write(s1);
        writer.newLine();
        writer.flush();




        StringBuilder sb = new StringBuilder(str);

        writer.write("Inserting i am an interface:");
        writer.newLine();
        writer.flush();

        //charsequence
        String keyword_1 = "string";
        int i = sb.indexOf(keyword_1);
        while (i >= 0){
          sb.delete(i, i+keyword_1.length());
          sb.insert(i, "CharSequence");
          i = sb.indexOf(keyword_1,i+keyword_1.length());
        }
        //System.out.println(sb);

        //
        String keyword_2 = "CharSequence";
        int l = sb.indexOf(keyword_2);
        while (l >= 0){
            sb.insert(l+keyword_2.length(), "(I am an interface)");
            l = sb.indexOf(keyword_2,l+19);
        }
        System.out.println(sb);

        //deleting vowels.

        writer.write("deleting the vowels:");
        writer.newLine();
        writer.flush();


        int m = sb.length()-1;
        char[] vowel = new char[] {'a', 'e', 'i', 'o', 'u', 'I'};
        while(m >= 0){
            char x = sb.charAt(m);
            boolean b1 = false;
            for( char y:vowel){
                if (x == y)
                    b1 = true;
            }
            if (b1)
                sb.deleteCharAt(m);
            m--;
        }
        System.out.println(sb);
    }
}
