import java.util.Scanner;

public class Permutations {
    static void perm(String s, String out) {
        if (s.isEmpty()) {
            System.out.println(out);
            return;
        }
        for (int i = 0; i < s.length(); i++)
            perm(s.substring(0, i) + s.substring(i + 1), out + s.charAt(i));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.hasNextLine() ? s.nextLine() : "ABC";
        perm(txt, "");
    }
}
