
// 1. Sum of Natural Numbers
// Find the sum of first N natural numbers using a loop.

// Input: N = 5
// Output: 15



import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int sum=0;
        for (int i = 1; i <= N; i++) {
            sum+=i;
            
        }
        System.out.println("Sum"+sum);





        
    }
    
}
