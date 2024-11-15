package Strings;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        int rem=0;
        int temp=n;

        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(temp==rev)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
