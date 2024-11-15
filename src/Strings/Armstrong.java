package Strings;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int rem=0;
        int sum=0;
        while(n>0){
            rem+=1;
            n=n/10;
        }
        n=temp;
        while(n>0){
            sum+=Math.pow(n%10,rem);
            n=n/10;
        }
        if(temp==sum){
            System.out.println("True");
        } else{
            System.out.println("False");
        }
    }
}
