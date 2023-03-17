package gr.aueb.cf.samples;

import java.util.Scanner;

class Example2 {
    
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int i =0;
        int num =0;
        int sum = 0;
        //Empty String
        String  primeNumbers = "";
        System.out.println("Enter the value of n:");
        int n = scanner.nextInt();
        scanner.close();
        for (i = 1; i <= n; i++)
        {
            int counter=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter ==2)
            {
                //Appended the Prime number to the String
                primeNumbers = primeNumbers + i + " ";
                sum = sum + (i*i);
            }
        }
        System.out.println("Prime numbers from 1 to n are :");
        System.out.println(primeNumbers);
        System.out.println("Square sum of Prime Numbers is: " + sum);
    }
}
