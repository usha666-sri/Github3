package Strings;
import java.util.Scanner;
public class Vowels {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String line =sc.nextLine();
        int vowels=0,consonants=0;
        line=line.toLowerCase();
        for(int i=0;i<line.length();i++){
            char ch=line.charAt(i);
            if(ch=='a'|| ch=='e'|| ch=='i' || ch=='o'|| ch=='u'){
                ++vowels;
            }
            else if(ch>='a' && ch<='z'){
                ++consonants;
            }
        }
        System.out.println("Vowels: "+ vowels);
        System.out.println("Consonants: "+ consonants);
    }
}

