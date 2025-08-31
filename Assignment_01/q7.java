// 7.Fibonacci Series
// Print the Fibonacci series up to N terms using a loop.
import java.util.*;

public class q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int num1=0;
        int num2=1;
        System.out.print(num1+" ");
        System.out.print(num2+" ");
        int num3;
        for (int i = 1; i <=N-2; i++) {
            num3=num1+num2;
            System.out.print(num3+" ");
            num1=num2;
            num2=num3;

            
        }

        
    }
    
}
