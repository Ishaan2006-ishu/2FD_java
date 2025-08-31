// 6. Palindrome Number
// Check if a given number is a palindrome (reads the same backward).

// Input: num = 121
// Output: Palindrome

// Input: num = 123
// Output: Not Palindrome
import java.util.*;
public class q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int d=N;
        int rev=0;
        while(N!=0){
            rev=rev*10+N%10;
            N=N/10;

        }
        if (d==rev){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }


    }
    
}
