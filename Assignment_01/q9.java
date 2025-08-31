// 9. Armstrong Number
// Check if a number is an Armstrong number.
// An Armstrong number is a number that is equal to the sum of cubes of its digits.

// Input: num = 153
// Output: Armstrong

// Input: num = 123
// Output: Not Armstrong

import java.util.*
;public class q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int d=N;
        String str=""+N;
        int size=str.length();
        int rev=0;
        while(N!=0){
            rev+=(int)Math.pow((N%10), size);
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
