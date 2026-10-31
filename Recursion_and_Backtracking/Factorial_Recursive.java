import java.util.Scanner;

public class Factorial_Recursive {
    static long fact(int n) {
        if (n <= 1)
            return 1;
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n < 0 || n > 20) {
            System.out.println("Enter a number from 0 to 20");
            return;
        }
        System.out.println(fact(n));
    }
}
