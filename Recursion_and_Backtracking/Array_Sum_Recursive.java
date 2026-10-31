import java.util.Scanner;

public class Array_Sum_Recursive {
    static int sum(int[] a, int n) {
        if (n == 0)
            return 0;
        return a[n - 1] + sum(a, n - 1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = s.nextInt();
        System.out.println(sum(a, n));
    }
}
