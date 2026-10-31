import java.util.Scanner;

public class Power_Recursive {
    static long pow(long x, int n) {
        if (n == 0)
            return 1;
        return x * pow(x, n - 1);
    }

    static long fast(long x, int n) {
        if (n == 0)
            return 1;
        long y = fast(x, n / 2);
        if (n % 2 == 0)
            return y * y;
        return x * y * y;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long x = s.nextLong();
        int n = s.nextInt();
        if (n < 0) {
            System.out.println("Use a non-negative exponent");
            return;
        }
        System.out.println("Simple: " + pow(x, n));
        System.out.println("Fast: " + fast(x, n));
    }
}
