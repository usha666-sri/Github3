package Strings;
import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=10;++i){
            System.out.printf("%d x %d = %d \n",num,i,num*i);
        }
    }
}
