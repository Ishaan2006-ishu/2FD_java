import java.util.*;
public class q11 {
    
    public static void main(String[] args) {
        
        
        
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();

        for (int a = 1; a <= N; a++) {
            for (int b = a; b <= N; b++) {
                int cSquared = a * a + b * b;
                int c = (int) Math.sqrt(cSquared);
                if (c * c == cSquared && c <= N) {
                    System.out.println(a + " " + b + " " + c);
                }
            }
        }
    }
}

