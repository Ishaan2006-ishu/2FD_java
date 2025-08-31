// 2. Multiplication Table
// Take a number from the user and print its multiplication table (up to 10).

// Input: N = 7
// Output:


// package Assignment_01;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int N=sc.nextInt();
        for (int i= 1; i <=10; i++) {
            System.out.println(N+"*"+i+"="+N*i);
            
        }
    }
    
}
