// 3. Factorial of a Number
// Calculate the factorial of a number N using a loop.

// Input: N = 5
// Output: 120


import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int fac=1;
        for (int i = N; i >0; i--) {
            fac*=i;

            
        }
        System.out.println("Factorial="+fac);

    }
    
}
