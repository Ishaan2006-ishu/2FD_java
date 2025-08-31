// 5. Sum of Digits
// Input a number and find the sum of its digits.

// Input: 432
// Output: 9

import java.util.*;

public class q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int N=sc.nextInt();
            int sum=0;
            while (N!=0) {
                int temp=N%10;
                sum+=temp;
                N=N/10;
            }
            System.out.println("Sum of digits="+sum);





        
        

    }
}

