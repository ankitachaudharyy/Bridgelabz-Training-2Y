import java.util.Scanner;

public class Fibonacci_Recursive {
    static long fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n < 0 || n > 45) {
            System.out.println("Enter a number from 0 to 45");
            return;
        }
        System.out.println(fib(n));
    }
}
