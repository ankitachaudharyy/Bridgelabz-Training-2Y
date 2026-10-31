import java.util.Scanner;

public class Fibonacci_Iterative {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n < 0 || n > 92) {
            System.out.println("Enter a number from 0 to 92");
            return;
        }
        long a = 0;
        long b = 1;
        for (int i = 0; i < n; i++) {
            long c = a + b;
            a = b;
            b = c;
        }
        System.out.println(a);
    }
}
