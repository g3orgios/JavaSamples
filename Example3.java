package gr.aueb.cf.samples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Example3 {

    // create object of buffer class.

    static BufferedReader br=new BufferedReader (new InputStreamReader(System.in));

    // function to check palindrome

    public static boolean IsPal(String s) {
        int l = s.length();
        String rev = "";
        for(int i = l - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        if(rev.equals(s))
            return true;
        else
            return false;
    }

    public static void main(String args[])throws IOException {

        // create function of palindromeWords.

        Tier3Question1 ob=new Tier3Question1();

        // enter the sentence.

        System.out.print("Enter the sentence : ");
        String s=br.readLine();

        // to convert into upper case.

        s  = s.toUpperCase();
        StringTokenizer str = new StringTokenizer(s,".?! ");
        int w = str.countTokens();
        String word[]=new String[w];
        for(int i=0;i<w;i++) {
            word[i]=str.nextToken();
        }
        int count=0;
        System.out.print("The palindrome words are : ");
        for(int i=0; i<w; i++) {
            if(ob.IsPal(word[i])==true) {
                count++;
                System.out.print(word[i]+" ");
            }
        }
    }
}
