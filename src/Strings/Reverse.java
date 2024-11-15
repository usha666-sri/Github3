package Strings;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int rem=0;
        int rev=0;
        while(a>0){
            rem=a%10;
            a=a/10;
            rev=rev*10+rem;
        }
        System.out.println(rev);
    }
}
