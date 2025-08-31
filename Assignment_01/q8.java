// 8. Prime Number Check
// Check if a number is prime using a loop.

// Input: num = 17
// Output: Prime

// Input: num = 20
// Output: Not Prime
import java.util.*;

public class q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        if (N ==1){
            System.out.println("False");
            return;
        }
        int flag=1;
        for (int i = 2; i < N; i++) {
            if (N%i==0){
                flag=0;
            }
            
        }
        if (flag==1){
            System.out.println("prime");
        }
        else{
            System.out.println("Not Prime");
        }

    }
    
}
