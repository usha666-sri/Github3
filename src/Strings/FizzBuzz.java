package Strings;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        for( i=1;i<n;i++)
            if(i%3==0 && i%5==0)
                System.out.print("\"FizzBuzz\",");
            else if(i%3==0)
                System.out.print("\"Fizz\", ");
            else if(i%5==0)
                System.out.print("\"Buzz\", ");
            else
                System.out.print("\""+i+"\", ");
        if(i%3==0 && i%5==0)
            System.out.print("\"FizzBuzz\" ");
        else if(i%3==0)
            System.out.print("\"Fizz\" ");
        else if(i%5==0)
            System.out.print("\"Buzz\" ");
        else
            System.out.print("\""+i+"\",");

    }
}
