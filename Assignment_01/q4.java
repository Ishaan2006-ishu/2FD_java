// 4. Count Digits in a Number
// Count the number of digits in an integer using a loop.

// Input: 98765
// Output: 5

import java.util.*;

public class q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int N=sc.nextInt();
            String str=""+N;
            int count=0;
            for (int i= 0; i < str.length(); i++) {
                
                count+=1;
            }
            System.out.println("Number of digits="+count);





        
        

    }
}
