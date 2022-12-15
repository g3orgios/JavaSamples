package gr.aueb.cf.samples;

import java.util.Scanner;

public class Tier1Question2 {

    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string text :");
        String a = sc.nextLine();
        //char ch[]=new char[s.length()];
        int count = Length(a);
        System.out.println("Number of words in a string is : " + count);
    }
    static int Length(String s)
    {
        int c = 0;
        for (int i = 0;i <= (s.length()-1);i++)
        {
            if(  ( (i>0) && (s.charAt(i)!=' ') && (s.charAt(i-1)==' ')) || ((s.charAt(i)!=' ') && (i==0)))
                c++;
        }
        return c;
    }
}
