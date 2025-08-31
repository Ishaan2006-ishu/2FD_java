// 10. Strong Number
// Check if a number is a Strong number.
// A Strong number is a number whose sum of factorials of digits equals the number itself.

// Input: num = 145
// Output: Strong

// Input: num = 123
// Output: Not Strong

import java.util.*;

public class q10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int d=N;
        
        int rev=0;
        while(N!=0){
            int fac=1;
            int temp=N%10;
            for (int i = temp; i >0 ; i--) {
                fac*=i;
                
            }
            rev+=fac;
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
