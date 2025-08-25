
//palindrome

public class question {
    public static void main(String[] args) {
        int n = 121;
        int d = n;
        int p = 0;

        while (n != 0) {
            p = (p * 10) + (n % 10); 
            n = n / 10;
        }

        if (d == p) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

