import java.util.Scanner;

public class Factorial_Iterative {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n < 0 || n > 20) {
            System.out.println("Enter a number from 0 to 20");
            return;
        }
        long ans = 1;
        for (int i = 2; i <= n; i++)
            ans *= i;
        System.out.println(ans);
    }
}
